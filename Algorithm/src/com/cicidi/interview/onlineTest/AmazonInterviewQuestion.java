package com.cicidi.interview.onlineTest;

import java.util.HashSet;

/**
 * Write a function that takes as an argument a list of integers, and return
 * only those integers in the original list that appear an even number of times.
 * For example, [1, 2, 1] should return [1], and [1, 2, 3, 4, 5, 1, 3, 4, 3]
 * should return [1, 4].
 */
public class AmazonInterviewQuestion {

	public static void main(String[] args) {
		int[] arr_1 = { 1, 2, 3, 4, 5, 1, 3, 4, 3 };
		int[] arr_2 = { 1, 2, 1 };
		for (Integer i : new AmazonInterviewQuestion().getList(arr_1)) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (Integer i : new AmazonInterviewQuestion().getList(arr_2)) {
			System.out.print(i + " ");
		}

	}

	public HashSet<Integer> getList(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> result_result = new HashSet<Integer>();
		for (int i : arr) {
			if (set.contains(i))
				set.remove(i);
			else
				set.add(i);
		}
		for (int i : arr) {
			if (!set.contains(i)) {
				result_result.add(i);
			}
		}
		return result_result;
	}
}
