package ie.atu.week5;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner input = new Scanner(System.in);
        String StuName = input.nextLine();
        System.out.println("You entered: " + StuName);

        System.out.println("Please enter your Student Email:");
        String StuEmail = input.nextLine();
        System.out.println("You entered: " + StuEmail);

        System.out.println("Please enter your Course:");
        String StuCourse = input.nextLine();
        System.out.println("You entered: " + StuCourse);

    }
}
