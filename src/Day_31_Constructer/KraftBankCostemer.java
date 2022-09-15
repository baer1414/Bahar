package Day_31_Constructer;

import java.util.Random;

public class KraftBankCostemer {
    public int customerld;
    public String customerFullName;
    public boolean isSms;
    public int customerAccount;
    public String customerToken;

    public KraftBankCostemer(int customerld, String customerFullName, boolean isSms) {
        this.customerld = customerld;
        this.customerFullName = customerFullName;
        this.isSms = isSms;

        Random random=new Random();
        this.customerToken=customerld+customerFullName.substring(0,2)+ (random.nextInt(8999)+1000);

    }
public void addmoney(int money){
        this.customerAccount+=(money*18.22);
}




}