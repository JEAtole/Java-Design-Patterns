public class Valet implements HotelService{
    @Override
    public void performService(int x) {
        pickUpVehicle(x);
    }

    private void pickUpVehicle(int plateNumber){
        System.out.println("Picked up vehicle with the plate number: " + plateNumber);
        System.out.println("...");
        System.out.println("Vehicle is parked. Thank you for availing our services!");
    }
}
