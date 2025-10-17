package through;
import needed.Travel;

public class Road implements Travel{
    int distance;
    String mode="Bus";
    public String Mode = "Bus";
    static final int price = 3;
    static final int time = 40;
    @Override
    public void getDistance(int km) {
        distance = km;
    }

    @Override
    public float getPrice() {
        return distance * price;
    }

    @Override
    public String getTime() {
        return String.format(person+"can reach  : %d ", distance / time);
    }
}