package com.team8.leetcode.problems.average_salary;
import java.util.Arrays;

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

