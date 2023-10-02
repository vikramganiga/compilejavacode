package com.core.java8.dm;

public interface Teacher {

    public default void whatIdo(){
        System.out.println("I am teacher");
    }

    public static void allStudents(){
        System.out.println("to all students");
    }
    
}
