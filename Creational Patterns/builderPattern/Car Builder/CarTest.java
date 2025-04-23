
public class CarTest {
    public static void main(String[] args){

        Car myCar = new Car.CarBuilder()
            .brand("Mercedes - Benz")
            .engineType("Diesel")
            .transmission("Automatic")
            .color("Violet")
            .capacity(4).build();
        
        System.out.println("Car brand: " + myCar.getBrand());
        System.out.println("Car engine type: " + myCar.getEngineType());
        System.out.println("Car transmission: " + myCar.getTransmission());
        System.out.println("Car color: " + myCar.getColor());
        System.out.println("Car capacity: " + myCar.getCapacity());

    }
}
