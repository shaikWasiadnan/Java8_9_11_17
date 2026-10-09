package com.adnan.java8_9_11.MarkerInterface.Clonable2.ShallowCopy;

import java.util.Arrays;
import java.util.List;

public class ShallowMain {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Blue","Yellow");
        Engine engine = new Engine(200.00);
        try{
            Car car = new Car("Audi","2002",list,engine);
            //Car clonedCar = new Car(car.name, car.model,car.listOfColorsAvailable,car.engine);
            Car clonedCar = (Car)car.clone();
            System.out.println(clonedCar);
            clonedCar.engine.power = 400.00;
            //After Update
            System.out.println(clonedCar);
            System.out.println(car);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
