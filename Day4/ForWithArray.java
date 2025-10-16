

public class ForWithArray{

    public static void main(String[] args){
        int[] arrays = {2,3,4,6,7,8,9};

        for(int i=0;i<arrays.length;i++){
            System.out.println("Index: " + i + "\tValue: " + arrays[i]);          
            System.out.println("Quote: \"" + arrays[i] + "\"");                      
            System.out.println("Backslash: \\" + arrays[i]);                         
            System.out.println("---------------------------\n");
        }
    }
}