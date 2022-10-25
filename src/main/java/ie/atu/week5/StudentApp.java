package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        String StuName = input.nextLine();
        StudentDetails StudentN = new StudentDetails();
        StudentN.setStuName(StuName);

        System.out.println("Please enter your Student Email:");
        String StuEmail = input.nextLine();
        StudentN.setStuEmail(StuEmail);

        System.out.println("Please enter your Course:");
        String StuCourse = input.nextLine();
        StudentN.setStuCourse(StuCourse);

        System.out.println("Please enter another name:");
        String StuName2 = input.nextLine();
        StudentDetails StudentN2 = new StudentDetails();

        System.out.println("Please enter another Student Email:");
        String StuEmail2 = input.nextLine();
        StudentN2.setStuEmail(StuEmail2);

        System.out.println("Please enter another Course:");
        String StuCourse2 = input.nextLine();
        StudentN2.setStuCourse(StuCourse2);


        StudentDetails StudentN3 = new StudentDetails();
        System.out.println("Please enter another name:");
        String StuName3= input.nextLine();

        System.out.println("Please enter another Student Email:");
        String StuEmail3 = input.nextLine();
        StudentN3.setStuEmail(StuEmail3);

        System.out.println("Please enter another Course:");
        String StuCourse3 = input.nextLine();
        StudentN3.setStuCourse(StuCourse3);


        System.out.println("\nFirst Student\nName:"+StudentN.getStuName());
        System.out.println("Email:"+StudentN.getStuEmail());
        System.out.println("Course:"+StudentN.getStuCourse());

        System.out.println("\nSecond Student\nName:"+StudentN2.getStuName());
        System.out.println("Email:"+StudentN2.getStuEmail());
        System.out.println("Course:"+StudentN2.getStuCourse());

        System.out.println("\nThird Student\nName:"+StudentN3.getStuName());
        System.out.println("Email:"+StudentN3.getStuEmail());
        System.out.println("Course:"+StudentN3.getStuCourse());
    }
}
