# Team 8: LeetCode Problem Solving (Java)

## Project Overview

This project is a collection of Java-based solutions to selected LeetCode problems, tackled collaboratively by **Team 8 : Samuel, Mohamed and Cantona**. 
Below is a **high-level summary** of the problems and the algorithms and reasoning used to solve them.

---

## Algorithm Summaries

### Problem 1: Average Salary Excluding the Minimum and Maximum Salary

**Problem Statement:**  
You are given an array of unique integers `salary`, where `salary[i]` represents the salary of the i-th employee.  
Return the average salary excluding the minimum and maximum salaries.

**Approach and Reasoning:**
1. **Sort the Array** to easily identify the minimum and maximum. The minimum will be first value in the sorted array and the maximum last.
2. **Ignore the min and max**, then sum the rest.
3. **Calculate the average** by dividing the sum by `(length - 2)`this excludes the min and max and properly calculates the average.
4. Return the result as a `double` to maintain precision.

---

### Problem 2: Squares of a Sorted Array

**Problem Statement:**  
Given an integer array `nums` sorted in non-decreasing order, return a new array of the squares of each number, also sorted.

**Approach and Reasoning:**
1. **Loop and square each number** in the array.
2. **Sort the new array** to maintain order, since squaring can shift positions (e.g., negative numbers become positive).
3. Return the sorted array of squares.

---

### Problem 3: Missing Number

**Problem Statement:**  
Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the one number that is missing.

**Approach and Reasoning:**
1. **Sort the array** to bring all numbers in order.
2. **Loop through the array**, comparing the index to the value.
3. If a mismatch is found, return the index as the missing number.
4. If no mismatch is found, the missing number is `n`.

---

### Problem 4: Add Two Numbers (Linked Lists)

**Problem Statement:**  
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order.  
Return their sum as a linked list in reverse order as well.

**Approach and Reasoning:**
1. **Use pointers** to traverse both linked lists.
2. **Simulate digit-by-digit addition**, just like you would on paper.
3. **Keep track of carry** values that overflow above 9 and save them in a carry variable.
4. **Build a new linked list** with the result.
5. Return the list starting from the next node after the dummy head.

---

### Problem 5: Merge Two Sorted Linked Lists

**Problem Statement:**  
Given the heads of two sorted linked lists, merge them into a single sorted linked list.

**Approach and Reasoning:**
1. **Initialize a dummy node** which acts as a placeholder to start the linked list.
2. **Use a pointer to build the new list**.
3. While both lists have nodes:
   - **Compare values** and insert the smaller one.
   - If values are equal, insert both.
4. **Attach any remaining nodes** from the non-empty list to finish building the list.
5. Return the merged list starting after the dummy node.

---

## Team Contribution

Each problem was:
- Discussed and broken down collaboratively
- Implemented in clean, readable Java code
- Documented with algorithm explanations for clarity
- Reviewed and tested by all team members

---

## 



