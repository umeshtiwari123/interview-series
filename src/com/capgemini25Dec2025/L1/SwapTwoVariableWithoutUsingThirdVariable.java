package com.capgemini25Dec2025.L1;


import java.util.*;
public class SwapTwoVariableWithoutUsingThirdVariable {


        public static void main(String[] args) {

            int a = 10;
            int b = 20;

            a = a+b;
            b = a-b;
            a = a-b;

            System.out.println("a ="+a+" , "+" b = "+b);


        }
    }

