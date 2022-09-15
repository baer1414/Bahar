package Day_31_Constructer;

import java.util.Random;

public class KrafBankCustomer_ {
    private int customerId;
    private String customerFullName;
    public boolean isSms;
    private double customerAccount;
    private String customerToken;

    public KrafBankCustomer_(int customerId, String customerFullName, boolean isSms) {
        this.customerId = customerId;
        this.customerFullName = customerFullName;
        this.isSms = isSms;

        this.customerToken=customerId+customerFullName.substring(0,2)+12;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerToken, String customerFullName) {
        if(customerToken.equals(this.customerToken)){
            this.customerFullName=customerFullName;
        }else{
            System.out.println(" not Auothrize");
        }

    }

    public double getCustomerAccount() {
        return customerAccount;
    }

    public String getCustomerToken() {
        return customerToken;
    }

    public boolean getisSms() {
        return isSms;
    }

    public void setIsSms(boolean issms) {
        isSms = issms;
    }

    public void addMoney(double money){
        this.customerAccount+=money;
    }







}
