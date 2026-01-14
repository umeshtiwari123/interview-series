package com.EmphasisInterview;

public class Interview {
// dependency injection
//     

    /*
    input: [2,7,11,5] target 9 output: [0,1]



		public static int[] twoSum(int[] nums, int target){

		Map<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i<nums.length;i++ ){
			int complement = target - nums[i];

			if(map.containsKey(complement)){
				return new int[]{map.get(complement), i};
			}
			map.put(nums[i],i);
		}

		}


		main(){


			int nums = {2,7,11,5};
			int target = 9;

			int[] result = twoSum(nums, target);
			System.out.println(Arrays.toString(result));
		}

		------------------

		[10,5,20,8] output:10


class SecondLargest{


	public static int findSecondLargest(int[] arr){

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int num: arr){
			if(num>largest){
				secondLargest = largest;
				largest = num;
			}else if(num> secondLargest && num!= largest){
				secondLargest = num;
			}

		}
		return secondLargest;
	}


	main(){


		int arr[] = {10,5,20,8};
		System.out.println(findSecondLargest(arr));
	}
}


--------------------------


Select *
from emp
where created_date >= CURRENT_DATE - INTERVAL '7' DAY;


Select *
from emp
where created_date >= NOW() - INTERVAL 7 DAY;

    *
    * */
}
