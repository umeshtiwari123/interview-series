package com.streams;

public class OriginalInterview {

    public static void main(String[] args) {
        /*
        *
        *
        * class Animal {//Parent
    void speak() {
        System.out.println("Animal speaks");
    }

    void eat(String food) {
        System.out.println("Animal eats " + food);
    }
}

class Dog extends Animal { //child
    @Override
    void speak() {
        System.out.println("Dog barks");
    }

    void eat(String food, int times) {
        System.out.println("Dog eats " + food + " " + times + " times");
    }
}

Animal a = new Dog(); // upcasting

a.speak(); //Dog barks

a.eat("bone");// Animal eats bone

a.eat("bone", 2);

{1,2,3,4,5,6, 7 , 8}
s.split(", " )
[[1,2,3,4] [5, 6, 7 ,8 ]]

List<String> sentences = Arrays.asList("Hello World", "Java 8 Streams feature");

// ["Hello World", "Java 8 Streams feature"]

// [["Hello World"], ["Java 8 Streams feature"]]

        *
        *
        *
        * String str = "swiss";



		{s = 3, w = 1, i =1}
		str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting())
		.entrySet().stream().filter(e->e.getValue()==1)
		.map(Map.Entry::getKey).findFirst().orElse(null);

*
*
*
		List<Integer> integerList = Arrays.asList(1,1,2,3,4,5,6,6,7);
		List<Integer> nonDuplicates = 	integerList.stream().filter(nums->integerList.stream().filter(n->n.equals(nums)).count() == 1)
			.distinct()
			.toList();


class Main {

    public static List<Integer> findLongestArray(int[] nums){
        Set<Integer> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;
        int startIndex= 0;

        for(int right = 0; right<nums.length ;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                left++;
            }
            set.add(nums[right]);

            if(right-left + 1 > maxLen){
                maxLen = right-left + 1;
                startIndex = left;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i=startIndex; i< startIndex+maxLen; i++){
            result.add(nums[i]);
        }

        return result;
    }



    public static void main(String[] args) {

        int[] nums = {5, 1, 3, 5, 2, 3, 4, 1};

        List<Integer> result = findLongestArray(nums);

        System.out.println(result);
    }






}






Problem Statement:
You are given an array balances[] representing daily balances of a savings account. Your task is to determine the maximum balance in every window of size k days to analyze short-term financial trends.
Function Signature:
public static int[] findMaxTrends(int[] balances, int k)
Input:
balances – array of integers (1 ≤ balances.length ≤ 10^5)
k – window size (1 ≤ k ≤ balances.length)
Output:
Return an array containing the maximum balance in each sliding window of size k.
🔍 Correct Example:
Input:
balances = {2400, 2600, 2500, 2700, 2800, 2600}
k = 3
Let’s compute the sliding windows and find the maximum in each:
Window 1: [2400, 2600, 2500] → max = 2600
Window 2: [2600, 2500, 2700] → max = 2700
Window 3: [2500, 2700, 2800] → max = 2800
Window 4: [2700, 2800, 2600] → max = 2800
✅ Correct Output:
[2600, 2700, 2800, 2800]



        *
        * *
        * */
    }
}
