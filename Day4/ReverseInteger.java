public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1234; 
        int rev = 0;
        int num = x;

        do {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        } while (num != 0);

        System.out.println("Reversed Integer: " + rev);
    }
}
