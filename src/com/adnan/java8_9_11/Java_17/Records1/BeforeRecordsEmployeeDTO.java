package com.adnan.java8_9_11.Java_17.Records1;

import java.util.Objects;

public class BeforeRecordsEmployeeDTO {
    private int id;
    private String name;
    private String department;

    public BeforeRecordsEmployeeDTO(String department, int id, String name) {
        this.department = department;
        this.id = id;
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BeforeRecordsEmployeeDTO that = (BeforeRecordsEmployeeDTO) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }

    @Override
    public String toString() {
        return "BeforeRecordsEmployeeDTO{" +
                "department='" + department + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
