package lab5;

public class pointMovable extends Point implements Movable {
    public pointMovable(int x, int y) {
        super(x, y);
    }

    @Override
    public Point Move(int x, int y) //перемещает точку на другие координаты
    {
        this.setX(getX()+x);
        this.setY(getY()+y);
        return this;
    }

    @Override
    public void MoveCenter(int x, int y) {

    }

}
