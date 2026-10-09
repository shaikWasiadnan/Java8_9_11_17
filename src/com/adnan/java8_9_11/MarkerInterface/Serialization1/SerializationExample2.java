package com.adnan.java8_9_11.MarkerInterface.Serialization1;

import java.io.Serializable;

public class SerializationExample2 implements Serializable {
    public int id;
    public String name;
    public SerializationExample2(int id, String name) {
        this.id = id;
        this.name= name;
    }

    @Override
    public String toString() {
        return "SerializationExample2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
