package com.adnan.java8_9_11.MarkerInterface.Clonable2.DeepCopy;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable{
    public String name;
    public String model;
    public List<String> listOfColorsAvailable;
    public Engine engine;
    public Car(String name, String model, List<String> listOfColorsAvailable, Engine engine){
        this.name=name;
        this.model=model;
        this.listOfColorsAvailable = new ArrayList<>();
        this.engine = engine;
    }
    public Car(Car car) {
        this.name = car.name;
        this.model= car.model;
        this.listOfColorsAvailable = new ArrayList<>();
        this.engine =new Engine(car.engine.power);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", listOfColorsAvailable=" + listOfColorsAvailable +
                '}';
    }


}
class Engine{
    public double power;
    public Engine(double power){
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                '}';
    }
}


