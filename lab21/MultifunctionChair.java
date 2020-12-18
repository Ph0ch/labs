package lab21;

public class MultifunctionChair implements Chair{
    private int legs;

    @Override
    public void HasLegs(int legs) {
        this.legs=5;
        
    }

    @Override
    public String ChairName() {
        return ("Многофункциональный");
    }
}
