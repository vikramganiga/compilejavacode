package com.core.systemdesign.factory;

public class CreditCard implements BankService {

    public CreditCard() {
        System.out.println(" Credit Card service created");
    }

    @Override
    public void getMoney() {
        System.out.println(" creadit");
    }

}
