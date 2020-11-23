package lab15;

public class Leg {
    private final String name;

    public Leg(String name) {

        this.name = name;
    }

    public void Step() {
        System.out.println("Я сделал шаг " + name);
    }
}
