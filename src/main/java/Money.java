import java.math.BigDecimal;

public class Money {
    private BigDecimal money;
    private Currency currency;

    public Money(BigDecimal money, Currency currency) {
        this.money = money;
        this.currency = currency;
    }

    public Money(Currency currency) {
        this.currency = currency;
        this.money = BigDecimal.ZERO;
    }
    public void addMoney(BigDecimal money){
        this.money = this.money.add(money);
    }
    public void removeMoney(BigDecimal money){
        this.money = this.money.add(money.negate());
    }
    public boolean checkCurrency(Currency currency){
        return currency.equals(this.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "money=" + money +
                ", currency=" + currency +
                '}';
    }
}
