import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Student {
    private static final Random random = new Random();
    private static int lastId = 0;
    private final String countryCode;
    private final int yearEnrolled;
    private final int ageEnrolled;
    private final String gender;
    private final boolean programmingExperience;
    private final Map<String, CourseEngagement> engagementMap;
    private long studentId;

    public Student(String countryCode, int yearEnrolled, int ageEnrolled, String gender, boolean programmingExperience, Map<String, CourseEngagement> engagementMap) {
        this.countryCode = countryCode;
        this.yearEnrolled = yearEnrolled;
        this.ageEnrolled = ageEnrolled;
        this.gender = gender;
        this.programmingExperience = programmingExperience;
        this.engagementMap = engagementMap;

        this.studentId += ++lastId;
    }

    public static Student getRandomStudent(Course... courses) {
        Map<String, CourseEngagement> engagementMapArgument = new HashMap<>();

        var enrollmentDate = LocalDate.now();


        Arrays.stream(courses).forEach(value -> {
            CourseEngagement courseEngagement = new CourseEngagement(
                    value,
                    enrollmentDate,
                    null,
                    0,
                    null
                    );

            engagementMapArgument.put(value.courseCode(), courseEngagement);
        });

        return new Student(
                "",
                enrollmentDate.getYear(),
                random.nextInt(18, 50),
                (new String[]{"M", "F"}[random.nextInt(1)]),
                random.nextBoolean(),
                engagementMapArgument
        );
    }

    public long getStudentId() {
        return studentId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getYearEnrolled() {
        return yearEnrolled;
    }

    public int getAgeEnrolled() {
        return ageEnrolled;
    }

    public String getGender() {
        return gender;
    }

    public boolean isProgrammingExperience() {
        return programmingExperience;
    }

    public Map<String, CourseEngagement> getEngagementMap() {
        return engagementMap;
    }

    public void addCourse(Course course) {

    }

    public void addCourse(Course course, LocalDate enrollDate) {
    }

    public int getAge() {
        return 0;
    }

    public int getMonthsSinceActive() {
        return 0;
    }

    public int getMonthsSinceActive(String courseCode) {
        return 0;
    }

    public int getPercentComplete(String courseCode) {
        return 0;
    }

    public int getYearSinceEnrolled(String courseCode) {
        return 0;
    }

    public void watchLecture() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "countryCode='" + countryCode + '\'' +
                ", yearEnrolled=" + yearEnrolled +
                ", ageEnrolled=" + ageEnrolled +
                ", gender='" + gender + '\'' +
                ", programmingExperience=" + programmingExperience +
                ", engagementMap=" + engagementMap +
                ", studentId=" + studentId +
                '}';
    }
}
