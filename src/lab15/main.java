package lab15;

// Необходимо написать класс робота который умеет ходить.
// За движение каждой его ноги отвечает отдельный поток. Шаг выражается в выводе в консоль LEFT или RIGHT.
public class main {
    public static void main(String[] args) {
        Robot robot = new Robot(new Leg("LEFT"), new Leg("RIGHT"));

        robot.Run();

    }
}

