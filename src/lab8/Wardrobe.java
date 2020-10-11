package lab8;

public class Wardrobe  extends  Furniture{
    double height;
    double weight;
    int hollowing;
    String name;
    double hollow;

    public Wardrobe(double height, double weight, int hollowing, String name) {
        this.height = height;
        this.weight = weight;
        this.hollowing = hollowing;
        this.name = name;
        this.hollow = hollow;
    }


    @Override
    public double hollowCalc() {
        return super.hollowCalc();
    }
}
