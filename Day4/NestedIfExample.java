

public class NestedIfExample{

    public static void main(String[] args){

        

        int a = 5, b = 10, c = 15;

        if (a > b)
            if (a > c)
                System.out.println("a is biggest");
        else
            System.out.println("c is biggest");
    }
};