package lab5;

public class rectangleMovable extends Rectangle implements ShapeMovable {

    @Override
    public void move(int x, int y) {
        pointMovable p1 = (pointMovable) getLeftpoint();
        p1.Move(x, y);
        pointMovable p2 = (pointMovable) getRightpoint();
        p2.Move(x, y);
    }
}
