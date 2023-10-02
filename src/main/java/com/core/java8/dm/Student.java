package com.core.java8.dm;

//default method
public interface Student{

    public void getSubjects();

    default int getScore(){
        System.out.println("I got 100% marks, super intelligenet");
        return 100;
    }
}