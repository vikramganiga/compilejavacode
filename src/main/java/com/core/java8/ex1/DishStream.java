package com.core.java8.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import static java.util.stream.Collectors.toList;
import java.util.stream.Collector;


import com.core.java8.ex1.Dish.Type;
import java.util.stream.Collectors;

public class DishStream {
    public static void main(String args[]){
        
        List<Dish> menu = Arrays.asList(
            new Dish("pastha", true, 100, Type.OTHER),
            new Dish("fish", false, 1000, Type.FISH),
            new Dish("rice", true, 100, Type.OTHER)
        );

       List<String> highCalories= menu.stream().filter(d -> d.getCalories() > 100).map(Dish::getName).limit(1).collect(toList());
       System.out.println(highCalories);

       Map<Boolean, List<Dish>> partitionMenu = menu.stream().collect(Collectors.partitioningBy(Dish::isVeg));

       System.out.println(partitionMenu.entrySet());
    }
}
