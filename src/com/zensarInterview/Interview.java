package com.zensarInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {
    /*
    public class Employee {

    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
---------------------------------


     */

    /*

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

write a java 8 stream-based function to find the 2nd highest paid employee in each department.
    The input will be a list of employee objects, and output should be a Map
     where the key is the department and value are the 2nd  highest paid employee in that department

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Umesh", "IT", 90000),
                new Employee("Rahul", "IT", 80000),
                new Employee("Amit", "IT", 70000),

                new Employee("Arjun", "HR", 60000),
                new Employee("Renuka", "HR", 50000),
                new Employee("Lalitha", "HR", 45000)
        );

        Map<String,Employee> secondHighestByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.collectingAndThen(Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                                .skip(1)
                                                .findFirst()
                                                .orElse(null))
                        ));

        secondHighestByDept.forEach((dept, emp) -> {
            System.out.println(dept+"================"+emp.getName() +"=========="+emp.getSalary());
        });

         Given a list of employees with their names, department, and salary, write a java 8 stream-based function to find the 2nd highest paid employee in each department. The input will be a list of employee objects, and output should be a Map where the key is the department and value are the 2nd  highest paid employee in that department


    }
}

     */
}
