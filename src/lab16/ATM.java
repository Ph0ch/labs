package lab16;

import java.text.MessageFormat;
import java.util.Random;

public class ATM {
    private String name;

    public ATM(String name) {

        this.name = name;
    }

    public void runWith(Account account) {
        Random random = new Random();


        Thread transactions = new Thread(() -> {
            for (int counter = 0; counter < 10; counter++) {
                synchronized (account) {
                    if (random.nextBoolean())
                    {
                        try {
                            double money = Math.round(random.nextDouble() * 1000);
                            account.AddMoney(money);
                            System.out.println(MessageFormat.format("{0}: Добавили денег: {1}. Всего денег: {2}", name, money, account.getMoney()));
                            Thread.sleep(random.nextInt(1));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else
                    {
                        double money = Math.round(random.nextDouble() * 2000);
                        try {

                            account.RemoveMoney(money);
                            System.out.println(MessageFormat.format("{0}: Убавили денег: {1}. Всего денег: {2}.", name, money, account.getMoney()));
                            Thread.sleep(random.nextInt(1));
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (Exception e) {
                            System.out.println(MessageFormat.format("{0}: попытались снять денег в количестве: {1}. {2}.", name, money,e.getMessage()));
                        }
                    }


                }
            }

        });

        transactions.start();
    }


}
