

import java.util.Scanner;
import student.*;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎓 Welcome to Student Management System");

        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter student age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter student marks: ");
                        double marks = sc.nextDouble();

                        Student student = new Student(name, age, marks);
                        FileManager.saveStudent(student);
                        break;

                    case 2:
                        FileManager.displayAllStudents();
                        break;

                    case 3:
                        System.out.println("Exiting program. Goodbye!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again!");
                }
            } 
            catch (InvalidDataException e) {
                System.out.println(e.getMessage());
            } 
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine(); // clear invalid input
            }
        }
    }
}
