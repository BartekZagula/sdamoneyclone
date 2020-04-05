
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Person{
    private String name;
    private Wallet wallet;

    public Person(String name) {
        this.name = name;
        this.wallet = new Wallet();
    }

    public void addMoney(double money, Currency currency){
        this.wallet.addMoney(BigDecimal.valueOf(money),currency);
    }
    public void addMoney(double money){
        this.wallet.addMoney(BigDecimal.valueOf(money),Currency.PLN);
    }

    public void removeMoney(double money, Currency currency){
        this.wallet.removeMoney(BigDecimal.valueOf(money),currency);
    }
    public void removeMoney(double money){
        this.wallet.removeMoney(BigDecimal.valueOf(money),Currency.PLN);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                '}';
    }
}