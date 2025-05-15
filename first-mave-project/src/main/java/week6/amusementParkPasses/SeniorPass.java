package week6.amusementParkPasses;

public class SeniorPass extends Pass{
    public SeniorPass(String holderName) {
        super(holderName);
    }

    public double calculateFinalPrice(){
        return basePrice * 0.70;
    }
}
