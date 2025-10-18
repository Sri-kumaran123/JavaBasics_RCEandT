package student;

import java.io.*;

public class FileManager {

    private static final String FILE_NAME = "students.txt";

    // Save a student's data to file
    public static void saveStudent(Student student) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(student.toString() + "\n");
            System.out.println("Student record saved successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

    // Display all student records
    public static void displayAllStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\nStudent Records:");
            System.out.println("--------------------------------------");

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("Name: " + parts[0] + " | Age: " + parts[1] + " | Marks: " + parts[2]);
            }

            System.out.println("--------------------------------------");
        } 
        catch (FileNotFoundException e) {
            System.out.println("No records found (file missing).");
        } 
        catch (IOException e) {
            System.out.println("Error while reading records: " + e.getMessage());
        }
    }
}
