package com.adnan.java8_9_11.Java_17.InstanceOf3;

public class Main {
    public static void main(String[] args) {
        ParentClass c1 = new ParentClass("Parent",24);
        ParentClass c2 = new Child1("Child1",12);
        if(c1 instanceof ParentClass){
            System.out.println("Yes c1 is instance of parent class");
        }
        else{
            System.out.println("Not an instance");
        }
        if(c2 instanceof ParentClass){
            System.out.println("Yes c2 is instance of parent class");
        }
        else{
            System.out.println("Not an instance");
        }
        //false
        if(c1 instanceof Child1){
            System.out.println("Yes c2 is instance of parent class");
        }
        else{
            System.out.println("Not an instance of Child1");
        }

        ParentInterface i1 = new Child2();
        if (i1 instanceof ParentInterface){
            System.out.println("Yes i1 is instance of parent Interface");
        }
        else{
            System.out.println("Not an instance of Child1");
        }
    }
}
/*
instanceOf returns boolean true or false. based on the criteria.
instanceOf is used to check wheather the object reference which is we are giving is a child or
its type or not. we can use this for classes, Interfaces

** This is used to avoid classCastException before casting any object reference to any other class
if the object is not the type of the class we will get classCastException which can be avoided using
instanceOf. mainly used in eqauls() method.

** we can also avoid null pointer Exception if object value is set to null then it returns false;
 */
