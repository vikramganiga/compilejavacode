package com.core.java8;

import java.util.Arrays;
import java.util.List;

public class TestStream {

    public static void main(String args[]){
        List<Integer> numbers= Arrays.asList(2,3,4,5);
        numbers.stream().map(x -> x+17).forEach(System.out::println);
        
    }
    
}
