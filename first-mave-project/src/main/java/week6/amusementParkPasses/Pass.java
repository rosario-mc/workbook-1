package week6.amusementParkPasses;

public class Pass {
    private String holderName;
    double basePrice = 89.50;

    public Pass(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double calculateFinalPrice(){
        return basePrice;
    }
}
