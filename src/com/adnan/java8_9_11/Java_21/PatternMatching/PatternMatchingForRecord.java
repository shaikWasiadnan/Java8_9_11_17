package com.adnan.java8_9_11.Java_21.PatternMatching;

import javax.xml.crypto.Data;

public class PatternMatchingForRecord {
    public static void main(String[] args) {
        Person p = new Person(1,"addy");
        deStructuring(p);
        Object e = new Employee("123",p);
        String employeeId = switch (e){
            case Person(int id,String name)-> {
                System.out.println(name);
                yield name;
            }
            case Employee(String empId,Person(int id,String name))->{
                System.out.println("emp id is: "+empId);
                yield empId;
            }
            default -> throw new IllegalStateException("Unexpected value: " + e);
        };
        System.out.println(employeeId);

    }
    public static void deStructuring(Person person){
        if(person instanceof Person p){
            System.out.println("id is: "+p.id()+" name is: "+p.name());
        }
    }
    public static void destructringForSwitch(Employee e){
        System.out.println(e.empId()+e.person().name());
    }
}

//This one line generates constructor,getters(id(),name()) ,toString(),equals(),hashcode() for us.
record Person(int id,String name){}
record Employee(String empId,Person person){}

/*
From java 21 we can do Pattern matching for Records also inside if/switch we can deStructure them also.

 */
