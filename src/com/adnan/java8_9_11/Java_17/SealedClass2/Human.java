package com.adnan.java8_9_11.Java_17.SealedClass2;

public sealed class Human permits Adnan,Wasi,Shaik {
    public void printName(){
        System.out.println("Default Human class");
    }
}
