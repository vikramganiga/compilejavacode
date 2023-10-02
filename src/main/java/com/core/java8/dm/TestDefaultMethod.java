package com.core.java8.dm;

public class TestDefaultMethod implements Student, Teacher {

    @Override
    public void getSubjects() {
       System.out.println("I am getting all subjects");
    }

    @Override
    public void whatIdo(){
        System.out.println("I am teach you lession");
    }

    public static void main(String args[]){
        TestDefaultMethod testDefaultMethod = new TestDefaultMethod();
        testDefaultMethod.getScore();
        testDefaultMethod.getSubjects();
        testDefaultMethod.whatIdo();
        Teacher.allStudents();
    }
}
