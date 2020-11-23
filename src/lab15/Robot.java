package lab15;

public class Robot {
    private final Leg left;
    private final Leg right;

    public Robot(Leg left, Leg right) {
        this.left = left;
        this.right = right;
    }

    public void Run() {
        System.out.println("Я пытаюсь сделать шаг: ");

        Thread leftThread = new Thread(() -> {

            for (int counter = 0; counter < 10; counter++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                left.Step();
            }

        });
        leftThread.start();

        Thread rightThread = new Thread(() -> {
            for (int counter = 0; counter < 10; counter++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                right.Step();
            }
        });
        rightThread.start();


    }
}
