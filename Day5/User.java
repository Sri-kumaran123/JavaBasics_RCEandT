import java.util.Scanner;

public class User {

    private String username;

    
    public User(String username) {
        this.username = username;
    }

    // Inner class representing a message sent by the user
    class Message {
        private String content;

        
        public Message(String content) {
            this.content = content;
        }

       
        public void display() {
            System.out.println(username + " says: " + content);
        }
    }

    public static void main(String[] args) {
    

        
        User user1 = new User("Srikumaran");
        User user2 = new User("Kumar");

        User.Message msg1 = user1.new Message("Hello, how are you?");
        User.Message msg2 = user2.new Message("I'm fine, thank you!");

        msg1.display();
        msg2.display();
       

        
    }
}
