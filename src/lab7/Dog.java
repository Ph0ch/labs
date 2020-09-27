package lab7;

public abstract class Dog {
    String name;
    String breed;
    int height;
    int weight;
    int fatty;


    public void calcFatty()
    {
       fatty=height-weight;

    }
}