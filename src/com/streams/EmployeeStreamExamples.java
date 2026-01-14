package com.streams;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class EmployeeStreamExamples {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "IT", 60000, 28),
                new Employee(2, "Bob", "HR", 40000, 35),
                new Employee(3, "Charlie", "Finance", 55000, 30),
                new Employee(4, "David", "IT", 70000, 40),
                new Employee(5, "Eve", "Finance", 30000, 25),
                new Employee(6, "Frank", "IT", 90000, 45),
                new Employee(7, "Grace", "HR", 50000, 29)
        );

        // 1. Employees salary > 50,000
        employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .forEach(System.out::println);
        System.out.println("-------------------------");
// 2. Employees younger than 30
        employees.stream()
                .filter(e -> e.getAge() < 30)
                .forEach(System.out::println);
        System.out.println("-------------------------");
// 3. Employees from IT department
        employees.stream()
                .filter(e -> "IT".equals(e.getDepartment()))
                .forEach(System.out::println);

        System.out.println("-------------------------");
// 4. Any employee older than 60
        boolean anyAbove60 = employees.stream().anyMatch(e -> e.getAge() > 60);
        System.out.println("anyAbove60 :"+anyAbove60);
        System.out.println("---------------------------");
// 5. All employees salary > 20,000
        boolean allAbove20k = employees.stream().allMatch(e -> e.getSalary() > 20000);
        System.out.println("allAbove20k :"+allAbove20k);
        System.out.println("-------------------------");
// 6. None in HR
        boolean noneHR = employees.stream().noneMatch(e -> "HR".equals(e.getDepartment()));

        System.out.println("noneHR :"+noneHR);
    }
}
