package com.core.ds.javaprime;

import java.lang.Character;
import java.util.Arrays;

public class WordFormation {
    
    char character[] = {'a','b','c'};
    String charString= String.copyValueOf(character);


    public void getWorldFormation(){
        System.out.println(charString);
        for(int i =0; i < charString.length(); i++ ){
            String startchar = charString.substring(i, i+1);
            System.out.println(startchar);
            String temp1=charString.substring(0,i);
            String temp2=charString.substring(i+1,charString.length());
            printSubString(startchar, temp1);
            printSubString(startchar, temp2);
        }
    }

    public void printSubString(String startChar, String temp){
        for(int i=0 ; i < temp.length(); i++)
            System.out.println(startChar+temp.substring(i,temp.length()));
    }

    public static void main(String[] args) {
        WordFormation wordFormation = new WordFormation();
        wordFormation.getWorldFormation();
    }

}
