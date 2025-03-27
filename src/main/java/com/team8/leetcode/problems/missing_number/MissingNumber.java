package com.team8.leetcode.problems.missing_number;

import java.util.Arrays;

public class MissingNumber {

	public int missingNumber(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		
		for (int i = 0; i < n; i++) {
			if (nums[i] != i) {
				return i;
			}

		}
		return n;
	}
}
