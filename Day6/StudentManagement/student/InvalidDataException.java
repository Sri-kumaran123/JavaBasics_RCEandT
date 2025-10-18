package student;

// Custom Exception for invalid student data
public class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}
