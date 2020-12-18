package lab21;

public class VictorianChair implements Chair{

    private int legs;

    @Override
    public void HasLegs(int legs) {
        this.legs=4;

    }

    @Override
    public String ChairName() {
        return ("Викторианский");
    }
}
