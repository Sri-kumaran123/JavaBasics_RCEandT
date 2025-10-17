package through;

public class Car extends Road{
    String mode = "Car";
    public String Mode = "Car";
    private static final int price = 15;
    @Override
    public float getPrice() {
        return distance * price;
    }
}