package com.cognizantLaptopCode;

import java.util.Objects;

public class Emp {

    private String name;

    private int age;

    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Emp emp = (Emp) object;
        return age == emp.age && Double.compare(salary, emp.salary) == 0 && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
