public class HouseKeeping implements HotelService{

    @Override
    public void performService(int x) {
        cleanRoom(x);
    }

    private void cleanRoom(int roomNumber){
        System.out.println("Cleaning room number: " + roomNumber);
        System.out.println("...");
        System.out.println("Room number " + roomNumber + " is cleaned. Thank you for availing our services!");
    }

}
