package com.team8.leetcode.problems.missing_number;

import java.util.Arrays;

/*
Problem 3: Missing Number

Problem Statement:  
You are given an array nums containing n distinct numbers in the range [0, n].
Return the only number in the range that is missing from the array.

Algorithm Explanation:  

This algorithm uses sorting followed by a simple loop to find the missing number.

1. Sort the Array: 
   - We begin by sorting the nums array using Java’s Arrays.sort() function. 
   - Once sorted, the elements should follow a sequence starting from 0 up to n, except for the one missing number..

2. Loop Through the Sorted Array:  
   - We then used a for loop from index 0 to n - 1, where n is the length of the array.  
   - During each iteration, we compare the current index with the value at that position.  
   - If nums[i] does not match i, then i is the missing number and we return it immediately.

3. Handle the Edge Case:  
   - If the for loop is completed without finding any mismatch, it means the missing number is n (for example, the array has [0, 1, 2] but 3 is missing).  
   - In this case, we return n after the loop.

4. Return the Result: 
   - The function returns the missing number as an integer, completing the process.

*/


//Code implementation
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
