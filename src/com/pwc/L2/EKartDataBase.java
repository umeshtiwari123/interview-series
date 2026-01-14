package com.pwc.L2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDataBase {

    public static List<Customer> getAll(){

        return Stream.of(new Customer(101, "Atul", "atul101@gmail.com", Arrays.asList("1010", "1011")),
                new Customer(102, "Bikash", "bikash102@gmail.com", Arrays.asList("1020", "1021")),
                new Customer(103, "Charan", "charan103@gmail.com", Arrays.asList("1030", "1031")),
                new Customer(104, "Daksh", "daksh104@gmail.com", Arrays.asList("1040", "1041"))
                ).collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Customer> customers = EKartDataBase.getAll();

        List<String> emails = customers.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());

        System.out.println(emails);

        List<List<String>> phones = customers.stream()
                .map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());

        System.out.println("Map:"+phones);

        List<String> phNum = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        System.out.println("FlatMap"+phNum);

        //converting flatMap to Map
        List<String> result = customers.stream()
                .map(Customer::getPhoneNumbers)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flatmap to Map:"+result);


    }

}
