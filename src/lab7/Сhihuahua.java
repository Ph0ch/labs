package lab7;

public class Сhihuahua extends Dog {
    String name;
    String breed;
    int height;
    int weight;
    int fatty;

    public Сhihuahua (int height, int weight, String name, String breed){
        this.breed=breed;
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    @Override
    public void calcFatty() {
        fatty=height-weight;
        System.out.println(fatty);
    }

}
