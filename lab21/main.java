package lab21;

import java.util.Scanner;

public class main {
    static Chair chair;

    public static void main(String[] args) {
        int n=0;
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберете стул: 1 - Магический,2 - Многофукнциональный, 3 - Викторианский");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            System.out.println(n);
        } else {
            System.out.println("Стул не выбран");
        }
            switch (n) {
                case 1:
                    client.Sit(new MagicChair());
                    break;
                case 2:
                    client.Sit(new MultifunctionChair());
                    break;
                case 3:
                    client.Sit(new VictorianChair());
                    break;
            }
    }

}
