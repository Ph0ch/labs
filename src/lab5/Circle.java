package lab5;
// Круг описывается вокруг точки и радиуса, point у нас есть
public class Circle {

    protected Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
