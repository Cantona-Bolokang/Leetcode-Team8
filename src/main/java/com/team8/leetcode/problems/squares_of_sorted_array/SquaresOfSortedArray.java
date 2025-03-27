package com.team8.leetcode.problems.squares_of_sorted_array;
import java.util.Arrays;

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



