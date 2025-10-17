package through;
import needed.Travel;

public class Air implements Travel{
    int distance;
    String mode="Air";
    public String Mode = "Air";
    private static final int price = 100;
    private static final int speed = 100;
    @Override
    public void getDistance(int km) {
        distance = km;
    }

    @Override
    public float getPrice() {
        return distance * price;
    }

    public float getPrice(boolean firsClass) {
        return distance * (price + 50);
    }

    @Override
    public String getTime() {
        return String.format(person+"can reach  : %d ", distance / speed);
    }
}