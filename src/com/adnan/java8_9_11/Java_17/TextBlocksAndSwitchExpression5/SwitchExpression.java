package com.adnan.java8_9_11.Java_17.TextBlocksAndSwitchExpression5;

public class SwitchExpression {
    public static void main(String[] args) {
        //before java 17 switch statement
        int num = 2;
        String day;
        switch (num){
            case 1:
                System.out.println("Its monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its wednesday");
                break;
            default:
                System.out.println("Rest of the week");

        }
        //After java 17 SWITCH STATEMENT
        int num1 = 2;
        switch (num1){
            case 1-> System.out.println("Its monday");
            case 2->System.out.println("Its Tuesday From java 17");
            case 3->System.out.println("Its wednesday");
            default ->  System.out.println("Rest of the week");
        }
        //AFTER JAVA 17 SWITCH EXPRESSION
        int num2 = 3;
        String weekDay = switch (num2){
            case 1->{
                System.out.println("Its monday");
                yield "MON";
            }
            case 2-> {
                System.out.println("Its Tuesday From java 17");
                yield "TUE";
            }
            case 3-> {
                System.out.println("Its wednesday");
                yield "WED";
            }
            default ->{
                System.out.println("Rest of the week");
                yield "THU/fri/SAT/SUN";
            }
        };
        System.out.println(weekDay);
    }
}
/*
After java 17 for switch statement there is no need for break statement after every case.
we have to use arrow -> symbol after case as lambda expression
->**
We can also write expression using switch expression so we can assign any value to the variable from
returned value of switch expression.
"yield" is the keyword which is used to return value from the cases and it is similar to
return statement and it's scope is within switch expression if we use return instead of switch
then it act as return statement for whole method its scope is at method level
and yield scope is at switch expression level.
whatever returned by yield will be assigned to the variable declared.
 */
