package com.pwc.L1;

import java.util.Objects;

public class Employee {

    String name;
    int age;
    long salary;
    String grade;

    public Employee(String name, int age, long salary, String grade) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", grade='" + grade + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return age == employee.age && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(grade, employee.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, grade);
    }
}
