public class NestedIfExample1{

    public static void main(String[] args){
        if (args.length != 1) {
            System.out.println("Usage: java NumberCheck <number>");
            return;
        }

        int num = Integer.parseInt(args[0]);

        if (num > 0) {
            System.out.println(num + " is Positive.");

            if (num % 2 == 0) {
                System.out.println("It is Even.");
            } else {
                System.out.println("It is Odd.");
            }

        } else if (num < 0) {
            System.out.println(num + " is Negative.");

            if (num % 2 == 0) {
                System.out.println("It is Even.");
            } else {
                System.out.println("It is Odd.");
            }

        } else {
            System.out.println("The number is Zero.");
        }
    }
}