package com.cognizantLaptopCode.CustomImmutableClass;

public final class Person {

    private final String name;

    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //keep only getters and no setters method


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
