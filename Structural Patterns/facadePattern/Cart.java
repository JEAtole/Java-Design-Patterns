public class Cart implements HotelService{

    @Override
    public void performService(int x) {
        requestCart(x);
    }

    private void requestCart(int numberOfCarts){
        System.out.println("Providing " + numberOfCarts + " carts");
        System.out.println("...");
        System.out.println("The carts have arrived and is ready for use. " +
                "Thank you for availing our services!" );
    }

}
