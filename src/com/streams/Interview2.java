package com.streams;

public class Interview2 {


    public    class Animal {

            void speak() {

                System.out.println("Animal speaks");

            }

            void eat(String food) {

                System.out.println("Animal eats " + food);

            }

        }

        class Dog extends Animal {

            @Override

            void speak() {

                System.out.println("Dog barks");

            }

            void eat(String food, int times) {

                System.out.println("Dog eats " + food + " " + times + " times");

            }

        }


        Animal a = new Dog();

//        a.speak();

//        a.eat("bone");

//        a.eat("bone", 2);

//        List<String> sentences = Arrays.asList("Hello World", "Java 8 Streams feature");


}
