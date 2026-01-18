package com.cognizantLaptopCode.CustomImmutableClass;

public class PersonMain {

    public static void main(String[] args) {
         Person person = new Person("Alice",  30);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
