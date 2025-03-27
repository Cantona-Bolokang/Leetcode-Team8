package com.team8.leetcode.problems.add_two_numbers;

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



