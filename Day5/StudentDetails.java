import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String department;
    private double marks;

    // Constructor to initialize student details
    public Student(int id, String name, int age, String department, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------------");
    }
}

public class StudentDetails {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Student[] students = new Student[n]; 

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Department: ");
            String department = scanner.nextLine();

            System.out.print("Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            // Create Student object using user input
            students[i] = new Student(id, name, age, department, marks);
        }

        // Display all student details
        System.out.println("\n===== All Student Details =====");
        for (Student student : students) {
            student.displayDetails();
        }

        scanner.close();
    }
}