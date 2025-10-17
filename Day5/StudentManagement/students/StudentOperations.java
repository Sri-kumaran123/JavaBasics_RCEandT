package students;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class StudentOperations {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add student
    public void addStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter student Marks: ");
        double marks = scanner.nextDouble();

        students.add(new Student(id, name, age, marks));
        System.out.println("Student added successfully!\n");
    }

    // List all students
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.\n");
            return;
        }
        System.out.println("List of Students:");
        for (Student s : students) {
            s.printDetails();
        }
        System.out.println();
    }

    // Search student by ID
    public void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student Found:");
                s.printDetails();
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Student not found.\n");
    }

    // Delete student by ID
    public void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) System.out.println("Student removed successfully!\n");
        else System.out.println("Student not found.\n");
    }

    // Sort students by marks
    public void sortStudentsByMarks() {
        students.sort(Comparator.comparingDouble(Student::getMarks).reversed());
        System.out.println("Students sorted by marks (high to low).\n");
    }
}
