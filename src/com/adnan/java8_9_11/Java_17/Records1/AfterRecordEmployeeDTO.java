package com.adnan.java8_9_11.Java_17.Records1;

public record AfterRecordEmployeeDTO(int id,String name,String department) {
    //additional

    //compact constructor
    public AfterRecordEmployeeDTO{
        if(name==null){
            try {
                throw new Exception("Name cannot be null");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    //ow parameterized constructor
    public AfterRecordEmployeeDTO(int id,String name){
        this(id,name,null);
    }
    //own getter
    public String  getEmployee(){
        if(this.department==null){
            return "id of employee is: "+id()+" name is: "+name();
        }
        return "";
    }
    //own static variables and methods
    private static int counter;
    private static int getCounter(){
        return ++counter;
    }
}
