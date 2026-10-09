package com.adnan.java8_9_11.Java_17.InstanceOf3;

public class ParentClass {
    public String  name;
    public double age;
    public ParentClass(String name,double age){
        this.name = name;
        this.age = age;
    }
    public void printDetails(){
        System.out.println("name is: "+this.name+" age is: "+this.age);
    }
}
