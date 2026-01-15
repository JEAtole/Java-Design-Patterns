
public class CarTest {

    public static void main(String[] args) {

        // Full car with all optional fields
        Car car1 = new Car.CarBuilder("Toyota", "V6")
                .transmission("Automatic")
                .color("Red")
                .capacity(5)
                .build();

        // Car with only required fields, defaults applied
        Car car2 = new Car.CarBuilder("Honda", "I4")
                .build();

        // Car with some optional fields changed
        Car car3 = new Car.CarBuilder("Ford", "V8")
                .color("Blue")
                .capacity(2)
                .build();

        System.out.println("--- Car 1 ---\n" + car1.getInfo());
        System.out.println("--- Car 2 ---\n" + car2.getInfo());
        System.out.println("--- Car 3 ---\n" + car3.getInfo());
    }
}
