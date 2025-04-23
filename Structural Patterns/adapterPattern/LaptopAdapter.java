public class LaptopAdapter implements PowerOutlet{

    private LaptopCharger laptopCharger;

    public LaptopAdapter(LaptopCharger laptopCharger) {
        this.laptopCharger = laptopCharger;
    }

    @Override
    public String plugin() {
        return laptopCharger.charge();
    }

}
