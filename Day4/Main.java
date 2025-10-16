import java.util.Scanner;

public class Main {
    
    static final int TOTAL_QUESTIONS = 3;
    static int score = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is 5 + 7?"
        };
        String[] options = {
            "a) Paris  b) London  c) Rome  d) Berlin",
            "a) Earth  b) Mars  c) Jupiter  d) Venus",
            "a) 10  b) 12  c) 14  d) 15"
        };
        char[] answers = {'a', 'b', 'b'}; 

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Answer the following questions:");

        
        for (int i = 0; i < TOTAL_QUESTIONS; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i]);

            char userAnswer;
            while (true) { 
                System.out.print("Your answer (a/b/c/d): ");
                String input = sc.nextLine();
                if (input.length() == 1 && "abcd".indexOf(input.charAt(0)) != -1) {
                    userAnswer = input.charAt(0);
                    break;
                } else {
                    System.out.println("Invalid input! Enter a, b, c, or d.");
                }
            }

            // Check answer
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + answers[i]);
            }
        }

        // Show final score
        System.out.println("\nQuiz Over!");
        System.out.println("Your Score: " + score + "/" + TOTAL_QUESTIONS);

        // Simple evaluation using switch
        switch (score) {
            case 3:
                System.out.println("Excellent! 🎉");
                break;
            case 2:
                System.out.println("Good job!");
                break;
            case 1:
                System.out.println("Needs improvement.");
                break;
            default:
                System.out.println("Better luck next time.");
        }

        sc.close();
    }
}
