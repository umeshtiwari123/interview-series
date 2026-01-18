package com.cognizantLaptopCode;

import java.util.Objects;

public class Employee {

    private String name;
    private int age;
    private String gender;
    private String department;

    public Employee() {
    }

    public Employee(String name, int age, String gender, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(gender, employee.gender) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, department);
    }
}
