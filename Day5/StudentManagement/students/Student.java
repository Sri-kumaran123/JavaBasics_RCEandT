package students;
import students.interfaceclasses.Printable; 

public class Student extends Person implements Printable {
    private int id;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        super(name, age);
        this.id = id;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    @Override
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks + ", Grade: " + getGrade());
    }

    @Override
    public void showInfo() {
        printDetails();
    }
}
