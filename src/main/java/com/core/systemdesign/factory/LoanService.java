package com.core.systemdesign.factory;

public class LoanService implements BankService {

    public LoanService(){
        System.out.println("created load service");
    }
    @Override
    public void getMoney() {
       System.out.println("loan");
    }
    
}
