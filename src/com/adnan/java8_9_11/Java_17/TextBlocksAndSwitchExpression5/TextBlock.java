package com.adnan.java8_9_11.Java_17.TextBlocksAndSwitchExpression5;

public class TextBlock {
    public static void main(String[] args) {
        //without text block before java17
        String multiLine = "Hi \n"+
                "How \n"+
                "are you \n";
        String json = "{\n"+
                "name : "+ "ad \n"+
                "age: "+"27 \n"+
                "}";
        System.out.println(multiLine);
        System.out.println(json);

        //with textblock after java17
        String multiLine2 = """
                Hi,
                How 
                are you
                """;
        String json2 = """
                {
                name : Ad,
                age : 24
                }
                """;
        System.out.println(multiLine2);
        System.out.println(json2);
    }
}
/*
With help of Text block we can write multiple line string without any concatenation
or without any escape characters like \n or \r . we just have to use three quotes """ """;
 */
