import java.util.Scanner;

public class ApplianceApp {

    public static void main(String[] args) {

        System.out.print("""
                [1] Laptop Charger
                [2] Refrigerator
                [3] Smartphone Charger
                Please choose which appliance to plug to power outlet:\s """);

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                PowerOutlet laptopChargerPO = new LaptopAdapter(new LaptopCharger());
                System.out.println(laptopChargerPO.plugin());
            }
            case 2 -> {
                PowerOutlet refrigeratorPO = new RefrigeratorAdapter(new Refrigerator());
                System.out.println(refrigeratorPO.plugin());
            }
            case 3 -> {
                PowerOutlet smartphoneChargerPO = new SmartphoneAdapter(new SmartphoneCharger());
                System.out.println(smartphoneChargerPO.plugin());
            }
            default -> System.out.println("Invalid Input");
        }

    }

}
