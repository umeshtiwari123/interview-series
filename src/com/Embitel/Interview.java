package com.Embitel;

public class Interview {
    /*
    Class Test{
     public static void main(String[] args){
          String s1 = new String("SampleTest").intern();
          String s2 = "SampleTest";
          String s3 = s2;

System.out.println(s1 == s2); //true
System.out.println(s2 == s3);// true
System.out.println(s3 == "Sample"+"Test");//true
System.out.println(s1 == s3);//true
     }
}
 ------------------------------------

 public class Test {
   static {
       System.out.println("Static");
   }

   {
       System.out.println("code block");
   }

   public Test(){
      System.out.println("Constructor");
   }

   public static void main(String[] args) {
       new Test();
       new Test();
   }
}

static
code block
constructor
code block
constructor
----------------------------------------

//Input 1  = [2,3,6]
Input 2  = [1,4,5]
output = [1,2,3,4,5,6]


public class Result{


	public static List<Integer> merge(List<Integer> a, List<Integer> b){

		List<Integer> result = new ArrayList<>();
			int i=0, j=0;

		while(i<a.size() && j<b.size()){
			if(a.get(i)<= b.get(j)){
				result.add(a.get(i++));
			}else{
				result.add(b.get(j++));
			}
		}
		while(i<a.size()){
			result.add(a.get(i++));
		}
		while(j<b.size()){
			result.add(b.get(j++));
		}
		return result;
	}
}


--------------------------------


Program
------------
input 1 = [1,2,3,1,4,5, 7]
Input 2 = 8
Output = [[1,2,5],[1, 7],[3, 5],[3, 4, 1],[1,2,4,1] ]



public class allSum{

	public static List<List<Integer>> findPossibleSums(int[] nums, int target){
		List<List<Integer>> result = new Arraylist<>();
		backtrack(nums, target, 0, new Arraylist<>(), result);
		return result;


	}

	public static void backtrack(int[] nums, int target, int start,
			List<Integer> temp, List<List<Integer>> result ){

		if(target == 0){
			result.add(new ArrayList<>(temp));
			return;
		}

		for(int i = start; i<nums.length;i++){
			if(nums[i]>target) continue;
				temp.add(nums[i]);
			backtrack(nums, target - nums[i], i+1, temp, result);
			temp.remove(temp.size() - 1);

		}
	}
}
}


---------------------------------

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.ArrayList;
class Main {

    public static List<List<Integer>> findPossibleSums(int[] nums, int target){
		List<List<Integer>> result = new ArrayList<>();
		backtrack(nums, target, 0, new ArrayList<>(), result);
		return result;


	}

	public static void backtrack(int[] nums, int target, int start,
			List<Integer> temp, List<List<Integer>> result ){

		if(target == 0){
			result.add(new ArrayList<>(temp));
			return;
		}

		for(int i = start; i<nums.length;i++){
			if(nums[i]>target) continue;
				temp.add(nums[i]);
			backtrack(nums, target - nums[i], i+1, temp, result);
			temp.remove(temp.size() - 1);

		}
	}
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,4,5, 7};
        int target = 8;
        System.out.print(findPossibleSums(nums, target));
    }
}
     */
}
