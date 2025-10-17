import through.*;
import needed.Travel;
class Main {
    public static void main(String[] args){
        Travel[] travels = {
                new Road(),
                new Air(),
                new Car()
        };

        for(Travel t:travels){

//            System.out.println("Mode : "+t.Mode);
            System.out.println("Mode : "+t.mode);
            t.getDistance(300);
            System.out.println("Price: "+t.getPrice());
            System.out.println(t.getTime());
            System.out.println("-----------------");
        }
    }
}