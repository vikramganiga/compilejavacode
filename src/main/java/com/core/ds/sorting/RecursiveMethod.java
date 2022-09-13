package com.core.ds.sorting;

public class RecursiveMethod {

    public static void main(String args[]){
        String value="madam";
        System.out.println("  "+reverse(value));
        if(value.contentEquals(reverse(value)))
            System.out.println("True");
        else
            System.out.println("false");
    }

    public static String reverse(String data){
       
        if(data.length() == 0){
            return data;
        }
        else{
          return reverse (data.substring(1)) + data.charAt(0);
        }
    }
    
}
