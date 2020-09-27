package lab5;
// Реализовать классов oint и cicrle
public class main {
    public static void main(String[] args)
    {
        Circle circle= new Circle(new Point(1,1),10);
        System.out.println(circle);
        pointMovable pointmovable = new pointMovable(10,10);
        System.out.println(pointmovable);
        pointmovable.Move(10,10);
        System.out.println(pointmovable);
        circleMovable circleMovable = new circleMovable(new pointMovable(10, 10), 10);
        circleMovable.MoveCenter(10, 10);
        System.out.println(circleMovable);
    }

}
