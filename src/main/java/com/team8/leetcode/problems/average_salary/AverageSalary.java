package com.team8.leetcode.problems.average_salary;
import java.util.Arrays;

/*
Problem 1: Average Salary Excluding the Minimum and Maximum Salary

Problem Statement:  
You are given an array of unique integers `salary` where `salary[i]` represents the salary of the i-th employee.  
Return the average salary of employees excluding the minimum and maximum salary.  

Algorithm Explanation:  

The algorithm follows a straightforward approach using sorting and a loop to calculate the average salary, excluding the minimum and maximum values. Here is a step-by-step explanation:

1. Sort the Array: 
   - We first sort the `salary` array using Java's `Arrays.sort()` method.  
   - After sorting, the minimum salary will be at index `0` and the maximum salary will be at index `salary.length - 1`.

2. Sum the Middle Elements:  
   - We initialize a variable `sum` to 0.  
   - We use a `for` loop that starts from index `1` and goes up to `salary.length - 2`, effectively skipping the minimum and maximum salaries.  
   - In each iteration, we add the current salary to the `sum`.

3. Calculate the Average:  
   - Once we have the sum of the remaining salaries, we divide it by `(salary.length - 2)` to get the average.  
   - We store this in a `double` variable to maintain floating-point precision.

4. Return the Result: 
   - Finally, we return the computed average.

*/

//Code implementation:
public class AverageSalary {
	
	public double average(int[] salary) {
        
		//Initialize sum variable to zero
		int sum = 0;


        //sort the array using Arrays.sort() method
		//After sorting the array, the minimum salary will be index 0
		//The maximum salary will be index salary.length - 1
        Arrays.sort(salary);


        //for loop to iterate through the salaries
        //add the salaries excluding the minimum and the maximum
        //store the result in the sum variable
        for(int i = 1; i < salary.length-1; i++){
            sum+=salary[i];
        }

        //calculate average salary by dividing the sum by number of salaries excluding minimum and maximum
        double average = sum/(salary.length-2);

        
        //return average salary
        return average;

	}


}



