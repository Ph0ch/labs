package lab16;

public class main {
    public static void main(String[] args) {
        Person person = new Person();
        Account account = new Account(person, 1000.00);
        ATM sberbank = new ATM("Cбербанк");
        ATM alfa = new ATM("Альфа");
        ATM tinkoff = new ATM("Тинькофф");
        Tester.test(account,sberbank,alfa,tinkoff);
    }
}
