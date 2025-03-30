package com.team8.leetcode.problems.squares_of_sorted_array;
import java.util.Arrays;

/*
Problem 2: Squares of a Sorted Array

Problem Statement:  
Given an integer array `nums` sorted in non-decreasing order, return a new array containing the squares of each number, also sorted in non-decreasing order.

Solution and Algorithm Explanation:

This problem is solved in two simple steps:

1. **Square Every Element:**
   - We start by creating a new array `squares` with the same length as the input array.
   - We iterate through the original array, squaring each number.
   - Each squared number is placed in the same position in the `squares` array.

2. **Sort the Result:**
   - After squaring all the numbers, we use `Arrays.sort()` to sort the new array in non-decreasing (ascending) order.
   - Finally, we return this sorted array.

Although the input array is already sorted, squaring the values can disrupt the order — especially because negative numbers, once squared, become positive and might end up larger than other numbers in the list.

*/


//Code Implementation:
public class SquaresOfSortedArray {
	public int[] sortedSquares(int[] nums) {
        //initialize arrayLentght variable which is the length of the input array
        int arrayLength = nums.length;
        
       //initialize an empty array that will store the squares
       //The empty array will have the same size as the input array
        int [] squares = new int [arrayLength];
        
        //Iterate through the input array from index 0 to arrayLength-1
        //Calculate the square of each value and store it in the squares array
        for(int i = 0; i < arrayLength; i++){
            squares[i] = nums[i]*nums[i];
        }
        
        //Use the Arrays.sort() method to sort the array in ascending order
        Arrays.sort(squares);
        
        //return sorted squares array
        return squares;
    }

}



