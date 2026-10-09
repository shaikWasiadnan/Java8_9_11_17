package com.adnan.java8_9_11.Java_17.SealedClass2;

public class Main {
    public static void main(String[] args) {
        Human adnan = new Adnan();
        Human wasi = new Wasi();
        Human shaik = new Shaik();
        Human khan = new Khan();

        adnan.printName();
        wasi.printName();
        shaik.printName();
        khan.printName();
    }
}
/*
Sealed classes gives us the control over inheritance means if we are using sealed keyword for any class
we must have to use permits clause to permit/give permission to the classes which ever classes we
mention after permits clause those classes can only extend our parent class no other class can extend it
our child classes which are extending our parent sealed class can only be
"sealed,non-sealed,final" type sealed classes has to mention permits clause and its childs
non-sealed can be extended by any class ,final class cannot be extended.
 */
