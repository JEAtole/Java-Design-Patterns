
public class Car {

    // Required parameters
    private final String brand;
    private final String engineType;

    // Optional parameters
    private final String transmission;
    private final String color;
    private final Integer capacity;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.capacity = builder.capacity;
    }

    // Getters
    public String getBrand() { return brand; }
    public String getEngineType() { return engineType; }
    public String getTransmission() { return transmission; }
    public String getColor() { return color; }
    public Integer getCapacity() { return capacity; }

    // Optional: show info for testing
    public String getInfo() {
        String info = "Brand: " + brand + "\nEngine: " + engineType + "\n";
        if (transmission != null) info += "Transmission: " + transmission + "\n";
        if (color != null) info += "Color: " + color + "\n";
        if (capacity != null) info += "Capacity: " + capacity + "\n";
        return info;
    }

    // Builder class
    public static class CarBuilder {

        // Required parameters
        private final String brand;
        private final String engineType;

        // Optional parameters with defaults
        private String transmission = "Manual";
        private String color = "White";
        private Integer capacity = 4;

        public CarBuilder(String brand, String engineType) {
            this.brand = brand;
            this.engineType = engineType;
        }

        public CarBuilder transmission(String transmission) { this.transmission = transmission; return this; }
        public CarBuilder color(String color) { this.color = color; return this; }
        public CarBuilder capacity(Integer capacity) { this.capacity = capacity; return this; }

        public Car build() { return new Car(this); }
    }
}
