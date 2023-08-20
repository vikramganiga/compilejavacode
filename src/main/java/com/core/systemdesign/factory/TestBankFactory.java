package com.core.systemdesign.factory;

import java.util.HashMap;
import java.util.function.Supplier;
import java.util.*;

public class TestBankFactory {

  
    public static void main(String[] args) {

        
        // simple way
        String type = "loan";

        BankServiceFactory factory = new BankServiceFactory();

        BankService service = factory.getBankService(type);
        service.getMoney();

        type = "credit";
        service = factory.getBankService(type);
        service.getMoney();

        //java 8 way
        service = (BankService) factory.getBankServiceJava8(type);
        service.getMoney();
        
    }

}
