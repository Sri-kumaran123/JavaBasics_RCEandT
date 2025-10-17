public class MultiConstructor {

    int x;
    int y;

    // Constructor 1 - no parameters
    public MultiConstructor() {
        System.out.println("Default constructor called");
        x = 0;
        y = 0;
    }

    // Constructor 2 - one parameter
    public MultiConstructor(int a) {
        System.out.println("Constructor with one parameter called");
        x = a;
        y = 0;
    }

    // Constructor 3 - two parameters
    public MultiConstructor(int a, int b) {
        System.out.println("Constructor with two parameters called");
        x = a;
        y = b;
    }

    // Display method
    void show() {
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        MultiConstructor e1 = new MultiConstructor();        // calls constructor 1
        MultiConstructor e2 = new MultiConstructor(10);      // calls constructor 2
        MultiConstructor e3 = new MultiConstructor(10, 20);  // calls constructor 3

        e1.show();
        e2.show();
        e3.show();
    }
}
