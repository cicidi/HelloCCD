package com.cicidi.leetcode;

import java.util.HashMap;

public class Question1 {

	public static void main(String[] args) {

		Question1 question1 = new Question1();

		int[] nums = new int[] { 2, 7, 11, 15 };

		int target = 9;

		System.out.println(question1.twoSum(nums, target)[0]);

		System.out.println(question1.twoSum(nums, target)[1]);

	}

	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> sumMap = new HashMap<>();

		HashMap<Integer, Integer> indexMap = new HashMap<>();

		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {

			if (sumMap.containsKey(target - nums[i])) {

				result[0] = indexMap.get(target - nums[i]);

				result[1] = i;

			}

			sumMap.put(nums[i], target - nums[i]);

			indexMap.put(nums[i], i);

		}

		// for(int i=0;i<nums.length;i++){

		// if ()

		// }

		return result;

	}

}
