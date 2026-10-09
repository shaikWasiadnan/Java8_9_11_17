package com.adnan.java8_9_11.Java_17.PatternMatching4;

public class WithOutPatternMatching {
    public static void main(String[] args) {
        Object cat = new Cat();
        Object dog = new Dog();
        if(cat instanceof Animal){
            Cat c = (Cat) cat;
            System.out.println("Yes cat is child of Animal");
        }
        else{
            System.out.println("No cat is not a child of Animal");
        }
        if(dog instanceof Animal){
            Dog d = (Dog) dog;
            System.out.println("Yes DOG is child of Animal");
        }
        else{
            System.out.println("No DOG is not a child of Animal");
        }
    }
}
/*
Here just to assign cat,dog object we are doing explicit casting after confirming it
is the child of Animal this is lot of boiler plate code
 */
