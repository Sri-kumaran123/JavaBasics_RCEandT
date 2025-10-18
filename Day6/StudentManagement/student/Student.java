package student;

public class Student {
    private String name;
    private int age;
    private double marks;

    // Constructor
    public Student(String name, int age, double marks) throws InvalidDataException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidDataException("❌ Name cannot be empty!");
        }
        if (age <= 0 || age > 120) {
            throw new InvalidDataException("❌ Invalid age! Must be between 1 and 120.");
        }
        if (marks < 0 || marks > 100) {
            throw new InvalidDataException("❌ Marks must be between 0 and 100.");
        }

        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + marks;
    }
}
