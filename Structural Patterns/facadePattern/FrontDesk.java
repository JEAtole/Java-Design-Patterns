public class FrontDesk {

    private final HotelService valet;
    private final HotelService houseKeeping;
    private final HotelService cart;

    public FrontDesk(){
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void valetService(int plateNumber){
        valet.performService(plateNumber);
    }

    public void houseKeepingService(int roomNumber){
        houseKeeping.performService(roomNumber);
    }

    public void cartService(int numberOfCarts){
        cart.performService(numberOfCarts);
    }

}
