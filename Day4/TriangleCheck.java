public class TriangleCheck {
    public static void main(String[] args) {
       
        int a = 5;
        int b = 5;
        int c = 5;

        System.out.println("Sides are: " + a + ", " + b + ", " + c);

       
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("It is a Valid Triangle.");

           
            if (a == b && b == c) {
                System.out.println("Type: Equilateral Triangle");
            } else {
                if (a == b || b == c || a == c) {
                    System.out.println("Type: Isosceles Triangle");
                } else {
                    System.out.println("Type: Scalene Triangle");
                }
            }

        } else {
            System.out.println("Not a Valid Triangle.");
        }
    }
}
