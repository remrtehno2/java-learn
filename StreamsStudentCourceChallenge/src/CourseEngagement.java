import java.time.LocalDate;

public class CourseEngagement {
    private Course course;
    private LocalDate enrollmentDate;
    private String engagementType;
    private int lastLecture;
    private LocalDate lastActivityDate;

    public CourseEngagement(Course course, LocalDate enrollmentDate, String engagementType, int lastLecture, LocalDate lastActivityDate) {
        this.course = course;
        this.enrollmentDate = enrollmentDate;
        this.engagementType = engagementType;
        this.lastLecture = lastLecture;
        this.lastActivityDate = lastActivityDate;
    }

    public String getCourseCode() {
        return "";
    }
    public int getEnrollmentYear() {
        return 0;
    }
    public int getLastActivityYear() {
        return 0;
    }
    public int getLastActivityMonth() {
        return 0;
    }
    public int getMonthsSinceActive() {
        return 0;
    }
    public double getPercentComplete() {
        return 0;
    }

    public void watchLecture() {

    }
}
