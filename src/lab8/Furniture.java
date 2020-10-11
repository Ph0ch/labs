package lab8;

public abstract class Furniture {

    double height;
    double weight;
    int hollowing;
    String name;
    double hollow;

    public double hollowCalc()
    {
        if (hollowing==1)
            return height*weight;
        else
            return 0;

    }


}
