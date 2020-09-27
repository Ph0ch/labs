package lab5;


public class circleMovable extends Circle implements Movable {

    public circleMovable(Point center, double radius) {
        super(center, radius);
    }


    @Override
    public Point Move(int x, int y) {
        return null;
    }

    @Override
    public void MoveCenter(int x, int y) {
        pointMovable point = (pointMovable) this.getCenter();
        point.Move(x, y);
        this.setCenter(point);

    }
}
