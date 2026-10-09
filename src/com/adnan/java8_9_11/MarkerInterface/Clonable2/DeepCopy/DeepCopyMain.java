package com.adnan.java8_9_11.MarkerInterface.Clonable2.DeepCopy;



import java.util.Arrays;
import java.util.List;

public class DeepCopyMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Blue","Yellow");
        Engine engine = new Engine(200.00);
        try{
            Car original = new Car("BMW","2004",list,engine);
            Car car = new Car(original.name,original.model,list,original.engine);
            Car clonedCar = new Car(car);
            System.out.println("Before Changes");
            System.out.println(clonedCar);
            System.out.println(original);
            clonedCar.listOfColorsAvailable.add("RED");
            clonedCar.engine.power=500.00;
            System.out.println("After changes");
            System.out.println(clonedCar);
            System.out.println(original);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
