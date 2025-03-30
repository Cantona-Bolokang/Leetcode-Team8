package com.team8.leetcode.problems.add_two_numbers;

/*
Problem 4: Add Two Numbers

Problem Statement:  
You are given two non-empty linked lists representing two non-negative integers.  
The digits are stored in reverse order, and each of their nodes contains a single digit.  
Add the two numbers and return the sum as a linked list.  
The two numbers do not contain any leading zero, except the number 0 itself.

Algorithm Explanation:  

1. Initialize Variables:
   - `carry` is set to 0 and will hold any overflow because when digits add up to more than 9, we need to carry over the extra to the next digit.
   - `first` and `second` are pointers to traverse the input linked lists `l1` and `l2`.
   - `result` is a dummy node to help build the resulting linked list.
   - `current` is used to add new nodes to the result list.

2. Traverse Both Lists:
   - While both lists have nodes, we:
     - Sum the values of the current nodes along with any carry from the previous step.
     - Update `carry` using integer division (`carry = sum / 10`).
     - Create a new node with the single-digit result (`sum % 10`) and link it to the result list. This is the unit digit of the sum.
     - Move `first`, `second`, and `current` to their next nodes.

3. Handle Remaining Nodes in the Longer List:
   - If one list is longer than the other, we continue the addition with the remaining nodes and the carry.
   - Check which list in not null and enter that loop
   - We use similar logic: add the current node value with carry, create a new node for the result, and move pointers forward.

4. Handle Final Carry:
   - After finishing both lists, if there’s still a carry left (like adding 9 + 1), we just create a final node with that carry.

5. Return the Result List:
   - Since the first node was a placeholder node, we return `result.next` to get the actual head of the resulting list.

*/


//Code implementation:
public class AddTwoNumbers {
	
	  //Definition for singly-linked list.
	    public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        // Initialize carry to handle sums >= 10
	        int carry = 0; 
	        
	        // Pointer for first Linkedlist
	        ListNode first = l1; 

	         // Pointer for second Linkedlist
	        ListNode second = l2; 

	        //Empty node to start result list
	        ListNode result = new ListNode(); 

	        // Pointer to build the result list
	        ListNode current = result; 

	        // Traverse both lists while both have nodes
	        while (first != null && second != null) {
	        	
	        	// Sum current digits + carry
	            int sum = first.val + second.val + carry; 
	            
	           //carry = 1 if the the sum > 10 and 0 if sum < 10;
	            carry = sum / 10;
	            
	            // Create new node with current digit
	            //get the remainder which is the single digit
	            //Extract it and save it the current.next LinkedList node
	            current.next = new ListNode(sum % 10); 
	            
	            // Move to next result node
	            current = current.next; 
	            
	            // Move to next node in first list
	            first = first.next; 
	            
	            // Move to next node in second list
	            second = second.next; 
	        }
	        
            /*The next while loop are run in the case that the LinkedLists are not the same size
             * That means one of them will point to null before the other*/
	        
	        // Process remaining nodes in the first list, if any
	        //This will be processed when the second list is null but the first is not
	        while (first != null) {
	            int sum = first.val + carry;
	            
	            //carry = 1 if the the sum > 10 and 0 if sum < 10;
	            carry = sum / 10; 
	            
	            //get the remainder which is the single digit
	            //Extract it and save it the current.next LinkedList
	            current.next = new ListNode(sum % 10);
	            
	            //Point to next on current
	            current = current.next;
	            
	            //point to next value on first
	            first = first.next;
	        }

	        // Process remaining nodes in the second list, if any
	      //This will be processed when the first Linkedlist is null but the second Linkedlist is not
	        while (second != null) {
	            int sum = second.val + carry;
	            carry = sum / 10;
	            current.next = new ListNode(sum % 10);
	            current = current.next;
	            second = second.next;
	        }

	        // If there's a remaining carry, add a new node
	        // A remaining carry happens at the end of the addition where the carry > 0
	        if (carry != 0) {
	        	current.next = new ListNode(carry);
	        }

	        result = result.next; //Point the result to the next node
	        
	        return result; // Return the head of the resulting list
	    }
	}



