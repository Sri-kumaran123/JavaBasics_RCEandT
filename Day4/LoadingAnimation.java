public class LoadingAnimation {
    public static void main(String[] args) throws InterruptedException {
        int dots = 0;
        boolean increasing = true;

        while (true) { 
            
            System.out.print("\r"); 
            System.out.print("Loading");
            for (int i = 0; i < dots; i++) {
                System.out.print(".");
            }

            
            if (increasing) {
                dots++;
            } else {
                dots--;
            }

           
            if (dots == 3) {
                increasing = false;
            } else if (dots == 0) {
                increasing = true;
            }

           
        }
    }
}
