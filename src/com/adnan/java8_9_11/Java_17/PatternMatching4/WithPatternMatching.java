package com.adnan.java8_9_11.Java_17.PatternMatching4;

public class WithPatternMatching {
    public static void main(String[] args) {
        Object obj1 = new Cat();
        Object obj2 = new Dog();
        if(obj1 instanceof Animal cat){
            System.out.println("Yes cat is child of Animal");
        }
        else{
            System.out.println("No cat is not a child of Animal");
        }
        if(obj2 instanceof Animal dog){
            System.out.println("Yes DOG is child of Animal");
        }
        else{
            System.out.println("No DOG is not a child of Animal");
        }

    }
}
/*
Here without explicit casting we are assigning those Object variables dirently to variables cat,dog
 */
