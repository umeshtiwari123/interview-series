package com.pwc.L1;

import java.util.*;
import java.util.stream.*;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Emp1", 25, 15000, "B"),
                new Employee("Emp2", 35, 35000, "A"),
                new Employee("Emp3", 20, 12000, "C"),
                new Employee("Emp4", 40, 45000, "A")
        );

        /*
         Sample Input:
            new Employee (Emp1, 25, 15000, "B")
            new Employee (Emp2, 35, 35000, "A")
            new Employee (Emp3, 20, 12000, "C")
            new Employee (Emp4, 40, 45000, "A")

            Question 1:
                Calculate the average salary for each grade of employees
                Output :
                A -> 40,000
                B -> 15,000,
                C -> 12,000
         */
        List<Employee> list2 = Arrays.asList(
            new Employee("Emp1", 25, 15000, "B" ),
                new Employee("Emp2", 35, 35000, "A" ),
                new Employee("Emp3", 20, 12000, "C" ),
                new Employee("Emp4", 40, 45000, "A" )
        );

        Map<String, Double> averageSalaryByGrade = list2.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGrade,
                        Collectors.averagingLong(Employee::getSalary)
                ));
                        list2.stream()
                                        .collect(Collectors.groupingBy(
                                                Employee::getGrade, Collectors.averagingLong(Employee::getSalary)
                                        ));
        averageSalaryByGrade.forEach((grade,avg) -> System.out.println(grade+"-----output----"+avg) );


        // Calculate average salary per grade
        Map<String, Double> avgSalaryByGrade =
                list.stream()
                        .collect(Collectors.groupingBy(
                                emp -> emp.grade,
                                Collectors.averagingLong(emp -> emp.salary)
                        ));

        // Print Output
        avgSalaryByGrade.forEach((grade, avg) ->
                System.out.println(grade + " -> " + String.format("%.0f", avg))
        );
    }
}
