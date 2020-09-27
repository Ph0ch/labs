package lab7;

public abstract class Dish {
    int deep;
    String style;
    String material;
    double radius;
    double volume;


    public void calcVolume()
    {
        volume=deep*radius;

    }
}
