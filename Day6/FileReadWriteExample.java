import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        String filename = "example.txt";

        
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a sample file!\n");
            writer.write("File handling in Java with exception handling.");
            System.out.println("✅ File written successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error while writing to the file: " + e.getMessage());
        }

        
        try (FileReader reader = new FileReader(filename)) {
            int character;
            System.out.println("\n📖 File Content:\n-----------------");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\n-----------------");
        } 
        catch (IOException e) {
            System.out.println("❌ Error while reading the file: " + e.getMessage());
        }
    }
}
