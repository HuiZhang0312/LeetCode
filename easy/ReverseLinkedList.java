package easy;

import tool.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		// Iterative
		ListNode prev = null;
	    ListNode curr = head;
	    while (curr != null) {
	        ListNode nextTemp = curr.next;
	        curr.next = prev;
	        prev = curr;
	        curr = nextTemp;
	    }
	    return prev;
	    
	    // Recursive
//	    if (head == null || head.next == null) return head;
//	    ListNode p = reverseList(head.next);
//	    head.next.next = head;
//	    head.next = null;
//	    return p;
    }
}
