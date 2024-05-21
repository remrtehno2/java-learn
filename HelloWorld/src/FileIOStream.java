import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("new_file-from-java.txt")) {

            fout.write("Text hey".getBytes());

        } catch (FileNotFoundException e) {
            System.out.println("Can't open sorry");
        } catch (IOException e) {
            System.out.println("Seems critical an error, Can't open sorry");
        }
    }
}
