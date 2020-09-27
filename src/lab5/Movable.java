package lab5;

// интерфейсы всегда заканчиваются на -able
// Отличия интерфейсa: не описывает поля данных
public interface Movable {
    Point Move(int x,int y);// интерфейс не реализует, это по сути шаблон
    void MoveCenter(int x, int y);
}
