package week6.amusementParkPasses;

public class ChildPass extends Pass{
    public ChildPass(String holderName) {
        super(holderName);
    }

    public double calculateFinalPrice(){
        return basePrice * 0.5;
    }
}
