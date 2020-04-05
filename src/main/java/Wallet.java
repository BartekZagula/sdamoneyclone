import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private List<Money> monies;
    {
        this.monies = new ArrayList<>();
    }

    public void addMoney(BigDecimal money, Currency currency){
        boolean isCurrencyInWallet = false;
        for (int i=0; i<monies.size();i++){
            if (monies.get(i).checkCurrency(currency)){
                monies.get(i).addMoney(money);
                isCurrencyInWallet = true;
            }
        }
        if(isCurrencyInWallet==false){
            this.monies.add(new Money(money,currency));
        }
    }
    public void removeMoney(BigDecimal money, Currency currency){
        boolean isCurrencyInWallet = false;
        for (int i=0; i<monies.size();i++){
            if (monies.get(i).checkCurrency(currency)){
                monies.get(i).removeMoney(money);
                isCurrencyInWallet = true;
            }
        }
        if(isCurrencyInWallet==false){
            this.monies.add(new Money(money.negate(),currency));
        }
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "money=" + monies +
                '}';
    }
}
