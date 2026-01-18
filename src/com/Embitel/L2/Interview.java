package com.Embitel.L2;

public class Interview {
    /*
    /*
i/p Array = {1,2,3,4,5,6,7}
if Number of items in Batch
-3
 O/p - {1,2,3),(4,5,6},{7}
-4
0/p - {1,2,3,4},{5,6,7}
*/
/*import java.util.*;
    class Main {
        public static void main(String[] args) {
            int[] input = {1,2,3,4,5,6,7};
            processInBatches(input,3);
            processInBatches(input,4);
        }

        static void processInBatches(int[] arr, int batchSize){
            for(int i =0;i<arr.length; i += batchSize){
                int end = Math.min(i+batchSize, arr.length);
                List<Integer> batch = new ArrayList<>();
                for(int j=i;j<end;j++){
                    batch.add(arr[j]);
                }
                System.out.println(batch);
            }
        }
    }
     */

    /*
    // add values in builder() in pattern add null check in builder pattern
    //Abc.newBuilder().set1.set2.set3.build()
    //builder design pattern we have to set all the parameter
    /*
            String my = "abc";
            my.concat(d);
            my.replace(a,1);
            my+= my.concat("d");
     */



     /*
     package 1
     class A - protected add()

     package 2
     class B extends A{
        A a = new B();
        B b = new A();

        void my(){
        super.add()
        }

        @Override
        void add(){

        }
     }
      */

     /*
     interface A - add() , static sub()
     interface B - add()

     class C
     class D

     C extends A, implements D
     C implements D
     A implements B
     A extends D
     A extends B
     C implements A, B
     C - able to access A.sub()
      */

    // in which cases the private methods will be tested
    
}
