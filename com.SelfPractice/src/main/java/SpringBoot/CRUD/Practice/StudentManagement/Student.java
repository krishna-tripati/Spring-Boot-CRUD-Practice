package SpringBoot.CRUD.Practice.StudentManagement;


public class Student {

    private int studId;
    private String studName;
    private String studEmail;
    private String studCourse;

    public Student(int studId, String studName, String studEmail, String studCourse) {
        this.studId = studId;
        this.studName = studName;
        this.studEmail = studEmail;
        this.studCourse = studCourse;
    }

    public int getStudId() {
        return studId;
    }

    public String getStudName() {
        return studName;
    }

    public String getStudEmail() {
        return studEmail;
    }

    public String getStudCourse() {
        return studCourse;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setStudEmail(String studEmail) {
        this.studEmail = studEmail;
    }

    public void setStudCourse(String studCourse) {
        this.studCourse = studCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studEmail='" + studEmail + '\'' +
                ", studCourse='" + studCourse + '\'' +
                '}';
    }
}
