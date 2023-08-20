package com.core.systemdesign.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BankServiceFactory {

      final static Map<String, Supplier<BankService>> mapv= new HashMap<String,Supplier<BankService>>();
   
     static {
        mapv.put("loan", LoanService::new);
        mapv.put("credit", CreditCard::new);
    }

   public BankService getBankService(String type){

    if(type.equals("loan"))
        return new LoanService();

    if(type.equals("credit"))
        return new CreditCard();
    
        return null;
   }

   public  BankService getBankServiceJava8(String type){

    Supplier<BankService> p = mapv.get(type);
    return  p.get();
   }
}
