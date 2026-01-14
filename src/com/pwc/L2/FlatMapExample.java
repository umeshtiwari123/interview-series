package com.pwc.L2;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Customer> customers = EKartDataBase.getAll();

        List<String> flatList = customers.stream()
                .flatMap(c->c.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        List<List<String>> nextList = customers.stream()
                        .map(customer -> customer.getPhoneNumbers())
                                .collect(Collectors.toList());
        System.out.println("FlatMap: "+flatList);

        System.out.println("NextList using map: "+nextList);
    }
}
