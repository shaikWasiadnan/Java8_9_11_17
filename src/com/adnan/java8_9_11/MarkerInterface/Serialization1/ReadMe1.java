package com.adnan.java8_9_11.MarkerInterface.Serialization1;

public class ReadMe1 {
}
/*
Marker Interface: Marker interface is interface which dont have any variables or any methods
inside it,Their implementation is present inside JVM.if any class is extending any marker interface
then it is an indication to JVM that this class has extra capabilities.
Some of the marker interfaces are Serialiazable,clonable

1)Serialiazable: If any class is implementing Serialiazable interface it is telling
JVM that this class object can be serialized and desirialized.
whenever a class is implementing Serialiazable interface tehn that class object can be
converted into BYTE STREAM then this byte stream can be stored in any file/memory/DB
or can be sent across the netword from one service to other service.
when the destination receives this byte stream this can be deSerialiazed back to get original object.
IMP:static data/ transient variables will be NOT A part of serialization and they will NOT be converted
into BYTE STREAM as static data belongs to class and transient data needs to be omitted from sharing.

important methods/steps to Serialiaze and deSerialiaze :
 from source object:
 FileInputStream inputFile = new FileInputStream(String filelocation);
 ObjectOutputStream obj = new ObjectOutputStream(inputFile);
 obj.writeObject(new dummy());
 obj.close();
 inputFile.close();

 From destination object:
 FileOutputStream outputFile = new FileOutputStream(String filelocation);
 ObjectInputStream obj = new ObjectInputStream(outputFile);
 obj.readObject(new dummy());
 obj.close();
 outputFile.close();


 */
