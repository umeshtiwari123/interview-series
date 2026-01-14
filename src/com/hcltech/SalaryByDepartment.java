package com.hcltech;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryByDepartment {
    public static void main(String[] args) {
        // Sample employee data
        List<Employee> employees = Arrays.asList(
                new Employee("A", 1000, "Dept1"),
                new Employee("B", 500, "Dept1"),
                new Employee("C", 1200, "Dept2"),
                new Employee("D", 500, "Dept2"),
                new Employee("E", 2000, "Dept3"),
                new Employee("F", 300, "Dept3")
        );


        Map<String, Integer> salaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment, LinkedHashMap::new,

                        Collectors.summingInt(Employee::getSalary)
                ));


        salaryByDept.forEach((dept, total) ->
                System.out.println(dept + " : " + total)
        );
    }
}
