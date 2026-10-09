package com.adnan.java8_9_11.Java_17.Records1;

public class Records {
    public static void main(String[] args) {
        AfterRecordEmployeeDTO dto1 = new AfterRecordEmployeeDTO(1,"Adnan","IT");
        AfterRecordEmployeeDTO dto2 = new AfterRecordEmployeeDTO(2,"wasi");
        System.out.println(dto1);
        System.out.println(dto2);
    }
}
/*
Record is generally used in place of Data transfer object classes,Record is an immutable class.
BEFORE RECORDS:
Just to create a DTO we need to write all the instance variables,constructors,getters,seeters
if required,equals(),hashcode(),toString() methods which will generate atleast 50 lines of
boiler plate code to eliminate this boiler plate code Record got introduced.

After RECORD:
Record creates an immutable final class under the hood which cannot be extended as internally it
already extends java.lang.Record class but record can implement any number of parameters.
In Record the instance variables are passed as arguments so java internally generates the
variables as final and public constructor so anyone can create object of record as normal class
and it generates getters,toString(),hashCode(),equals() methods,and doesnot generates setters()
as this is immutable class and values are only set during the object creation.
to check compile the record class we can see the result (javac filename.java)

Additionally
We can add our own parmeterized constructor,Compact Constructor(which dont take any arguments
which only declares rules such as id length should be greater than 0 name cannot be null etc..,
which will be added int the beggining of our default constructor automatically).
we can declare static variables,static methods also.
Getters will be called as variableName() which is a bit different from getVariableName() from normal getters.


 */
