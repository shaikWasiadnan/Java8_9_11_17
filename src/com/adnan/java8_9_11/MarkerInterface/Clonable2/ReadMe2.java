package com.adnan.java8_9_11.MarkerInterface.Clonable2;

public class ReadMe2 {
}
/*
Clonable:
Clonable is also a Marker interface which dont have any fields or methods declared inside it.
its implementation is present inside JVM.
Any class implementing Clonable interface means it is saying JVM that this class have extra
capabilities to clone this class object.
->Cloning can happen in two ways 1)Shallow Copy 2)Deep Copy
1)Shallow Copy:
Shallow Copy means if any class has primitive variables also refrenced/nested objects or any collection
then whenever we do Shallow Copying of main object then a new object will be created
and primitive values will get copied directly but bith original and copied object will point to the
same reference/memory of the nested objects or the collection.

2)Deep Copy
Here whenever we do object.clone() then two new objects will be created and all the primitive values
will be copied to new object and here nested objects will also be created in seperate memory location
and both original and clonedObject will point to different memory locations for the nested objects or reference
type.
->To achieve Deep Copy we need to create one extra constructoe which initializes all the
reference type to new memory locations.
 */
