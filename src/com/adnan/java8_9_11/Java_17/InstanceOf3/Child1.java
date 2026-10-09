package com.adnan.java8_9_11.Java_17.InstanceOf3;

public class Child1 extends ParentClass{
    public Child1(String  name, double age) {
        super(name, age);
    }
    @Override
    public void printDetails(){
        System.out.println("name is: "+this.name+" age is: "+this.age);
    }
}
