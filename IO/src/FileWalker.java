import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class FileWalker {

    public static void main(String[] args) {

        Path startingPath = Path.of(".");
        FileVisitor<Path> statsVisitor = new StatsVisitor(2);
        try {
            Files.walkFileTree(startingPath, statsVisitor);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static class StatsVisitor extends SimpleFileVisitor<Path> {
        private final Map<Path, Map<ATTRIBUTES, Long>> folderSizes = new LinkedHashMap<>();
        private final int printLevel;
        private Path initialPath = null;
        private int initialCount;

        public StatsVisitor(int printLevel) {
            this.printLevel = printLevel;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
                throws IOException {

            Objects.requireNonNull(file);
            Objects.requireNonNull(attrs);
            folderSizes.merge(file.getParent(), Map.of(
                    ATTRIBUTES.SIZE, 0L,
                    ATTRIBUTES.COUNT_FILES, 0L,
                    ATTRIBUTES.COUNT_FOLDERS, 0L
            ), (o, n) -> {
                var size = o.get(ATTRIBUTES.SIZE) + attrs.size();
                var fileCount = o.get(ATTRIBUTES.COUNT_FILES) + 1;

                return Map.of(
                        ATTRIBUTES.SIZE, size,
                        ATTRIBUTES.COUNT_FILES, fileCount,
                        ATTRIBUTES.COUNT_FOLDERS, 0L
                );
//                o += attrs.size()
            });
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                throws IOException {

            Objects.requireNonNull(dir);
            Objects.requireNonNull(attrs);

            if (initialPath == null) {
                initialPath = dir;
                initialCount = dir.getNameCount();
            } else {
                int relativeLevel = dir.getNameCount() - initialCount;
                if (relativeLevel == 1) {
                    folderSizes.clear();
                }
                folderSizes.merge(dir, Map.of(
                        ATTRIBUTES.SIZE, 0L,
                        ATTRIBUTES.COUNT_FILES, 0L,
                        ATTRIBUTES.COUNT_FOLDERS, 1L
                ), (old, newVal) -> Map.of(
                        ATTRIBUTES.SIZE, old.get(ATTRIBUTES.SIZE),
                        ATTRIBUTES.COUNT_FILES, old.get(ATTRIBUTES.COUNT_FILES),
                        ATTRIBUTES.COUNT_FOLDERS, old.get(ATTRIBUTES.COUNT_FOLDERS) + 1
                ));
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc)
                throws IOException {

            Objects.requireNonNull(dir);
//            if (exc != null)
//                throw exc;

            if (dir.equals(initialPath)) {
                return FileVisitResult.TERMINATE;
            }

            int relativeLevel = dir.getNameCount() - initialCount;
            if (relativeLevel == 1) {
                folderSizes.forEach((key, value) -> {

                    int level = key.getNameCount() - initialCount - 1;
                    if (level < printLevel) {
                        if (value != null) {


                            System.out.printf("%s[%s] - %,d bytes - Files: %s = Folders: %s\n",
                                    "\t".repeat(level), key.getFileName(), value.get(ATTRIBUTES.SIZE), value.get(ATTRIBUTES.COUNT_FILES), value.get(ATTRIBUTES.COUNT_FOLDERS));
                        }
                    }
                });

            } else {
                Map<ATTRIBUTES, Long> folderSize = folderSizes.get(dir);

//                folderSizes.merge(dir.getParent(), 0L, (o, n) -> o += folderSize);
            }
            return FileVisitResult.CONTINUE;
        }

        enum ATTRIBUTES {
            SIZE,
            COUNT_FILES,
            COUNT_FOLDERS
        }
    }
}
