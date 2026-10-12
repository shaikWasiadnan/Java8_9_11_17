package com.adnan.java8_9_11.Java_21.PatternMatching1;

public class PatternMatchingForSwitch {
    public static void main(String[] args) {
        String s = "Hello world";
        Integer i = 10;
        switch (i){
            case null-> System.out.println("Value is null");
            case Integer i1 when i1>100-> System.out.println("Boiling "+i1);
            case Integer i2 when i2<0 -> System.out.println("Cooling "+i2);
            case Integer i3 when i3<20-> System.out.println("under 20 value is  "+i3);
            //            case String s1-> System.out.println("It is string "+s1);
            default -> System.out.println("Its default");
        }
    }
}
/*
Before java 21 if we were using switch statement/expression then inside switch block
only primitive type or string or constants were allowed after java 21 we can use
Pattern matching inside switch statements we can pass child of any parent
then whenever we are passing case Dog d-> then this will do three things:
if we pass parent as the argument and getting child as input then we can generally check wheather it is
child of the passed parent or not with the help of patternMatching instanceOf keyword then inside if statements
also we can directly assign them to a variable if they are the child like if(Dog instance of Animal a) sout(a);
 now pattern matching inside switch expression/statement can do three things first check is it the instanceOf
  parent if yes cast it to original type then assign it to a variable directly like case String a: sout(a);
   and we can also do null check using case earlier it was not possible.
 */
