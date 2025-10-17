public class Temperature {
    double value;      
    String scale;     

    // Constructor
    public Temperature(double value, String scale) {
        this.value = value;
        this.scale = scale.toUpperCase();
    }

    // Convert to Celsius
    double toCelsius() {
        switch (scale) {
            case "F": return (value - 32) * 5 / 9;
            case "K": return value - 273.15;
            default:  return value; 
        }
    }

    // Convert to Fahrenheit
    double toFahrenheit() {
        switch (scale) {
            case "C": return (value * 9 / 5) + 32;
            case "K": return (value - 273.15) * 9 / 5 + 32;
            default:  return value; 
        }
    }

    // Convert to Kelvin
    double toKelvin() {
        switch (scale) {
            case "C": return value + 273.15;
            case "F": return (value - 32) * 5 / 9 + 273.15;
            default:  return value; 
        }
    }

    // Display conversions
    void showConversions() {
        System.out.println("Original: " + value + " " + scale);
        System.out.println("In Celsius: " + toCelsius());
        System.out.println("In Fahrenheit: " + toFahrenheit());
        System.out.println("In Kelvin: " + toKelvin());
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Temperature t1 = new Temperature(100, "C");
        Temperature t2 = new Temperature(32, "F");
        Temperature t3 = new Temperature(300, "K");

        t1.showConversions();
        t2.showConversions();
        t3.showConversions();
    }
}
