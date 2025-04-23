public class Cash implements PaymentType {

    @Override
    public String calculatePayment(){
        String output = "";
        output += "Payment is Cash.\n";
        output += "No incentives.\n";


        return output;
    }

}
