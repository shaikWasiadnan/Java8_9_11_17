package com.adnan.java8_9_11.MarkerInterface.Serialization1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {
        //Serialization
        SerializationExample2 object = new SerializationExample2(1,"Shaik Wasi Adnan");
        String file = "C:\\Users\\SHAIK IDREES\\OneDrive\\Desktop\\example.txt";
        try{
            FileOutputStream outputFile = new FileOutputStream(file);
            ObjectOutputStream outputStream=new ObjectOutputStream(outputFile);
            outputStream.writeObject(object);
            outputStream.close();
            outputFile.close();
            System.out.println("Object has been serialized");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        object = null;

        //DeSerialization
        try {
            FileInputStream inputFile = new FileInputStream(file);
            ObjectInputStream inputStream=new ObjectInputStream(inputFile);
            object = (SerializationExample2) inputStream.readObject();
            inputStream.close();
            inputFile.close();
            System.out.println("Object Has been Deserialized");
            System.out.println(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
