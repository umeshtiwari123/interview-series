package com.cognizantLaptopCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMainDriver {
    public static void main(String[] args) {
        List<Emp> employeeList = new ArrayList<>();

        Emp e1 = new Emp("ABC", 21, 10000);
        Emp e2 = new Emp("DEF", 22, 12000);
        Emp e3 = new Emp("GHI", 24, 14000);
        Emp e4 = new Emp("PQR", 28, 20000);
        Emp e5 = new Emp("XYZ", 26, 25000);


        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        employeeList.stream().filter(e->e.getAge()>25)
                .map(emp-> emp.getSalary() + ((emp.getSalary()*10)/100))
                .forEach(System.out::println);

        List<Emp> incrementedSalary = employeeList.stream()
                .map(e->{
                    if(e.getAge()>25){
                        e.setSalary(e.getSalary()*1.10);
                    }
                    return e;
                }).collect(Collectors.toList());

        System.out.println(incrementedSalary);
    }
}
