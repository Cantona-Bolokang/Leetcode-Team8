package com.team8.leetcode.problems.merge_two_sorted_lists;

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
