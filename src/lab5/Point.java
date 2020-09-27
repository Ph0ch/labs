package lab5;
// Объект характирезующий точку в пространстве, с двумя координатами
public class Point {
    private int x;
    private int y;
    //alt+insert генерация геетеров и сеттеров


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    } // Конструктор

    protected void setX(int x)
    {
        this.x = x;
    }
    protected void setY(int y)
    {
        this.y = y;
    }
    public int getY()
    {
        return y;
    }
    public int getX()
    {
        return x;
    }
    //getter setter


    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    } // метод string
}
