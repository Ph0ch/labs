package lab21;

public class MagicChair implements lab21.Chair {
    private int legs;

    @Override
    public void HasLegs(int legs) {
        this.legs=9999;

    }

    @Override
    public String ChairName() {
        return ("Магический");
    }
}
