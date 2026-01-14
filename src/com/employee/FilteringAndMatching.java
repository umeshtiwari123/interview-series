package com.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndMatching {

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
        // Find all employees whose salary is greater than 50,000.

        String result = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .map(e -> e.getName() + " : " + e.getSalary())
                .collect(Collectors.joining(", "));

        System.out.println(result);

        // 2. Employees younger than 30

        String result2 = employees.stream()
                .filter(e->e.getAge()<30)
                .map(e->e.getName()+" : "+e.getAge())
                .collect(Collectors.joining(", "));

        System.out.println(result2);

        // 3. Find employees from the “IT” department.

        String result3 = employees.stream()
                .filter(e->e.getDepartment().equalsIgnoreCase("IT"))
                .map(e->e.getName()+" : "+e.getDepartment())
                .collect(Collectors.joining(", "));

        System.out.println(result3);
    }
}
