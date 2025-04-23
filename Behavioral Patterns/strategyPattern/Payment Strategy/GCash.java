public class GCash implements PaymentType {

    @Override
    public String calculatePayment(){

        String output = "";
        output += "Payment is GCash.\n";
        output += "Energy for trees: 10 points.\n";

        return output;
    }

}
