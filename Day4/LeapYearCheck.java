public class LeapYearCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java LeapYearCheck <year>");
            return;
        }

        int year = Integer.parseInt(args[0]);

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is NOT a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
