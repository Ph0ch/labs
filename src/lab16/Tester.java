package lab16;

public class Tester {
    public static void test(Account account, ATM sberbank, ATM alfa, ATM tinkoff) {
        sberbank.runWith(account);
        alfa.runWith(account);
        tinkoff.runWith(account);
    }

}
