package ie.atu.week5;

public class StudentDetails {
    private String StuName;
    private String StuEmail;
    private String StuCourse;


    public String getStuName() {return StuName;}

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public String getStuEmail() {
        return StuEmail;
    }

    public void setStuEmail(String StuEmail) {
        this.StuEmail = StuEmail;
    }

    public String getStuCourse() {
        return StuCourse;
    }

    public void setStuCourse(String StuCourse) {
        this.StuCourse = StuCourse;
    }

    public StudentDetails() {
    }
    public StudentDetails(String StuName, String StuEmail, String StuCourse){
        this.StuName= StuName;
        this.StuEmail=StuEmail;
        this.StuCourse=StuCourse;
    }

}
