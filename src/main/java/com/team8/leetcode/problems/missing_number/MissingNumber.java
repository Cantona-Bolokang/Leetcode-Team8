package com.team8.leetcode.problems.missing_number;

import java.util.Arrays;

public class MissingNumber {

	public int missingNumber(int[] nums) { // Using the method to find the missing number in the given array 
		// to get the length of the array
		int n = nums.length;
		// sorting through the array
		Arrays.sort(nums); //
		
		// Iterating through the already sorted array using a for loop
		for (int i = 0; i < n; i++) {
			if (nums[i] != i) {// if the current index does not match its corresponding value return the index
				
				// the missing number is found
				return i;
			}

		}
		// if no missing number is found return n
		return n;//if the missing number is the last element in the array
	}
}
