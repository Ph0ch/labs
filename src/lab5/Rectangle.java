package lab5;

public class Rectangle {

    private Point leftpoint = new Point(10,10);
    private Point rightpoint = new Point(15,15);

    public Point getLeftpoint() {
        return leftpoint;
    }

    public void setLeftpoint(Point leftpoint) {
        this.leftpoint = leftpoint;
    }

    public Point getRightpoint() {
        return rightpoint;
    }

    public void setRightpoint(Point rightpoint) {
        this.rightpoint = rightpoint;
    }
}
