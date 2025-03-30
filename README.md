# Team 8: LeetCode Problem Solving (Java)

## Project Overview

This project is a collection of Java-based solutions to selected LeetCode problems, tackled collaboratively by **Team 8 : Samuel, Mohamed and Cantona**. 
Below is a **high-level summary** of the problems and the algorithms used to solve them.

---

## Algorithm Summaries

### Problem 1: Average Salary Excluding the Min and Max

We calculate the average salary by first removing the minimum and maximum values from the dataset, then computing the average of the remaining values. 
This approach ensures that outliers (min and max salaries) don't skew the result. Sorting the array helps easily identify the smallest and largest values.

---

### Problem 2: Squares of a Sorted Array

Although the original array is sorted, squaring each number (especially negatives) can disrupt the order. We first square all numbers, then sort the 
resulting values to restore ascending order. 

---

### Problem 3: Missing Number

Given a list of unique numbers from a range, we identify the missing one by comparing index positions to actual values. If the numbers don’t match their
expected positions, we return the index as the missing value. If all align, the missing number is at the end of the range.

---

### Problem 4: Add Two Numbers (Linked List)

We simulate traditional column-based addition, digit by digit, using two linked lists. Starting from the least significant digit, we add corresponding 
digits and manage the carry-over. The result is built into a new linked list representing the total in reverse order, matching the input format.

---

### Problem 5: Merge Two Sorted Linked Lists

We merge two already sorted linked lists into one unified, sorted list. By continuously comparing the front of each list and choosing the smaller value, 
we build the new list node by node. 

---

## Team Contribution

Each solution was collaboratively designed and implemented, with a focus on:
- **Clean code structure with comments**
- **Comprehensive algorithm explanations before each code implementation**



