import students.StudentOperations;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentOperations operations = new StudentOperations();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Sort Students by Marks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> operations.addStudent();
                case 2 -> operations.listStudents();
                case 3 -> operations.searchStudent();
                case 4 -> operations.deleteStudent();
                case 5 -> operations.sortStudentsByMarks();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.\n");
            }
        } while (choice != 6);

        scanner.close();
    }
}
