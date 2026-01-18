package com.cognizantLaptopCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeProgram {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ABC", 30 , "Female", "HR"));
        employeeList.add(new Employee("PQR", 25 , "Male", "IT"));
        employeeList.add(new Employee("LMN", 30 , "Male", "HR"));
        employeeList.add(new Employee("XYZ", 28 , "Female", "IT"));

        //1) print distinct department
            employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        //2) find the count of employees in each department
        Map<String, Long> countDept = employeeList.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.counting()
        ));
        System.out.println(countDept);

        //3) average age of female and male employees
        Map<String, Double> averageAge = employeeList.stream().collect(Collectors.groupingBy(
                Employee::getGender, Collectors.averagingInt(Employee::getAge)
        ));
        System.out.println(averageAge);
    }
}
