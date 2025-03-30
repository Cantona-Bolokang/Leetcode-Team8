package com.team8.leetcode.problems.merge_two_sorted_lists;


/*
Problem 5: Merge Two Sorted Lists

Problem Statement:  
You are given the heads of two sorted linked lists, `list1` and `list2`.  
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.  

Return the head of the merged linked list.

Solution and Algorithm Explanation:

To solve this problem, we simulated the process of merging two sorted sequences, just like in the merge step of merge sort. Here's a breakdown of the approach:

1. **Define a ListNode Class:**  
   - We use a standard singly linked list node structure where each node has a `val` (value) and a `next` (pointer to the next node).

2. **Initialize a Dummy Node:**  
   - We create a dummy node as a placeholder to help us build the final merged list.  
   - A pointer called `merge` is set to this dummy node and will be used to keep track of where we’re adding new nodes.

3. **Traverse Both Lists Simultaneously:**  
   - While both lists have nodes:
     - Compare the current node values of `list1` and `list2`.
     - Attach the node with the smaller value to the merged list and move that list’s pointer forward.
     - If both nodes have the same value, we add **both** to the merged list and advance both pointers.

4. **Attach Remaining Nodes (if any):**  
   - After the main loop, one of the lists may still have remaining nodes.
   - Since the lists are already sorted, we can directly attach the remainder of the non-empty list to the merged list.

5. **Return the Merged List:**  
   - We return `Node.next` because the first dummy node was just a placeholder and does not contain a meaningful value.

*/


//Code Implementation
public class MergeTwoSortedLists {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// Create a dummy node to help construct the merged list
		ListNode Node = new ListNode();

		// Pointer to track the current position in the new merged list
		ListNode merge = Node;

		// Traverse both lists while neither is empty
		while (list1 != null && list2 != null) {

			// If the current node in list1 is smaller, add it to the merged list
			if (list1.val < list2.val) {
				merge.next = new ListNode(list1.val); // Create a new node with list1's value
				list1 = list1.next; // Move to the next node in list1
				merge = merge.next; // Move the merge pointer forward
			}

			// If the current node in list2 is smaller, add it to the merged list
			else if (list1.val > list2.val) {
				merge.next = new ListNode(list2.val); // Create a new node with list2's value
				list2 = list2.next; // Move to the next node in list2
				merge = merge.next; // Move the merge pointer forward
			}

			// If the values in both lists are equal, add both nodes to the merged list
			else {
				merge.next = new ListNode(list1.val); // Add the first matching node
				merge = merge.next; // Move the merge pointer forward
				merge.next = new ListNode(list2.val); // Add the second matching node
				merge = merge.next; // Move the merge pointer forward

				// Move both list pointers forward
				list1 = list1.next;
				list2 = list2.next;
			}
		}

		// If list1 has remaining elements, append them to the merged list
		if (list1 == null) {
			merge.next = list2;
		}
		// If list2 has remaining elements, append them to the merged list
		if (list2 == null) {
			merge.next = list1;
		}

		// Return the merged list, skipping the dummy node
		return Node.next;
	}

}
