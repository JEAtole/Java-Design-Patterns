public class Order {
    private Double orderAmount;
    private PaymentType paymentType;

    public Order (Double orderAmount, PaymentType paymentType){
        this.orderAmount = orderAmount;
        this.paymentType = paymentType;
    }

    // Three types of payment: GCash, Maya, Cash

    public String calculatePayment (){

        return "You order amount is " + orderAmount + "\n" + 
                paymentType.calculatePayment();

    }

}
