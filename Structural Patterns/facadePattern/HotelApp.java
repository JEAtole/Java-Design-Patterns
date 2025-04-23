import java.util.Scanner;

public class HotelApp {

    public static void main(String[] args) {

        System.out.print("""
                Welcome to HotelApp!
                These are the services available:
                [1] Valet Service
                [2] House Keeping
                [3] Request Cart
                Please choose a service you would like to use:\s""");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        FrontDesk frontDesk = new FrontDesk();

        switch (choice) {
            case 1 -> {
                System.out.println("Please provide the vehicles plate number:");
                int plateNumber = sc.nextInt();
                System.out.println();
                frontDesk.valetService(plateNumber);
            }
            case 2 -> {
                System.out.println("Please provide your room number:");
                int roomNumber = sc.nextInt();
                System.out.println();
                frontDesk.houseKeepingService(roomNumber);
            }
            case 3 -> {
                System.out.println("How many carts would you like to request:");
                int numberOfCarts = sc.nextInt();
                System.out.println();
                frontDesk.cartService(numberOfCarts);
            }
            default -> System.out.println("Invalid input");
        }

    }

}
