package com.cicidi.leetcode;

import java.util.ArrayList;

import java.util.List;

public class Question4 {

	public static void main(String[] args) {

		int[] nums1 = new int[] { 1, 2 };

		int[] nums2 = new int[] { 3, 4 };

		// int[] nums1 = new int[] { 1, 2, 3, 5 };

		// int[] nums2 = new int[] { 3, 4, 6, 7 };

		Question4 question4 = new Question4();

		System.out.println(question4.findMedianSortedArrays(nums1, nums2));

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		double result = 0;

		int totalLength = nums1.length + nums2.length;

		int a = 0;

		int b = 0;

		List<Integer> list = new ArrayList<>();

		for (int i = 0, j = 0; i < nums1.length || j < nums2.length;) {

			if (i < nums1.length)

				a = nums1[i];

			else

				a = Integer.MAX_VALUE;

			if (j < nums2.length)

				b = nums2[j];

			else

				b = Integer.MAX_VALUE;

			if (a <= b) {

				list.add(a);

				i++;

			} else {

				list.add(b);

				j++;

			}

			if (i + j >= (totalLength / 2 + 1)) {

				if (totalLength % 2 == 1) {

					result = list.get(totalLength / 2);

				} else {

					result = (list.get(totalLength / 2 - 1) + list.get(totalLength / 2)) * 1.0 / 2;

				}

				break;

			}

		}

		return result;

	}

}