public class Palindrome {
    public static void main(String[] args) {
        int x = 12321; 
        

        int num = x;
        int rev = 0;

        while (num != 0) { 
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (rev == x) {
            System.out.println(x + " is a palindrome");
        } else {
            System.out.println(x + " is not a palindrome");
        }
    }
}
