package com.adnan.java8_9_11.Java_17.SealedClass2;

public sealed class Wasi extends Human permits MD{
    @Override
    public void printName(){
        System.out.println("Wasi This side");
    }
}
