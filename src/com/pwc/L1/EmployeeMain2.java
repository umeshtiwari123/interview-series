package com.pwc.L1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain2 {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Emp1", 25, 15000, "B"),
                new Employee("Emp2", 35, 35000, "A"),
                new Employee("Emp3", 20, 12000, "C"),
                new Employee("Emp4", 40, 45000, "A")
        );

        Map<String ,Double> res = list.stream()
                .collect(Collectors.groupingBy(Employee::getGrade,
                        Collectors.averagingLong(Employee::getSalary)));

        res.forEach((grade, avg) -> System.out.println(grade+"****"+Math.round(avg)));
    }
}
