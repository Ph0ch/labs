package lab16;

public class Account {
    private Person person;
    private double money;

    public Account(Person person, double money) {
        this.person = person;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void AddMoney(double money) {
        this.money=this.money+money;
    }

    public void RemoveMoney(double money) throws Exception {
        if (this.money-money<0)
        {
            throw new Exception("Недостаточно средств");
        }
        else
        {
            this.money=this.money-money;
        }
    }
}
