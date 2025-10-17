class SmartRoom {
    // Private fields
    private double temperature; 
    private int lightIntensity; 

    // Constructor
    public SmartRoom(double temperature, int lightIntensity) {
        setTemperature(temperature);
        setLightIntensity(lightIntensity);
    }

    // Getter and Setter for temperature
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature >= 15 && temperature <= 30) { // safe range
            this.temperature = temperature;
        } else {
            System.out.println("Temperature out of safe range (15-30°C).");
        }
    }

    // Getter and Setter for light intensity
    public int getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(int lightIntensity) {
        if (lightIntensity >= 0 && lightIntensity <= 100) {
            this.lightIntensity = lightIntensity;
        } else {
            System.out.println("Light intensity must be 0-100.");
        }
    }

    // Display current room settings
    public void showRoomStatus() {
        System.out.println("Room Temperature: " + temperature + "°C");
        System.out.println("Light Intensity: " + lightIntensity + "%");
        System.out.println("---------------------------");
    }
}

public class SetandGet {
    public static void main(String[] args) {
       
        SmartRoom room = new SmartRoom(22, 70);

        
        room.showRoomStatus();

        
        room.setTemperature(32); // invalid
        room.setLightIntensity(85); // valid

        
        room.showRoomStatus();

        
        room.setTemperature(25);
        room.showRoomStatus();
    }
}
