package easy;

import tool.ListNode;

public class MergeSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		if(l1.next!=null && l1.val>l1.next.val){
		    l1 = reverseList(l1);
		}
		if(l2.next!=null && l2.val>l2.next.val){
		    l2 = reverseList(l2);
		}
		
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
    }
    // In case of lists are descending.
    public ListNode reverseList(ListNode head) {
         ListNode t = null;
		
        while(head!=null){
        	ListNode next = head.next;
        	head.next = t;
        	t = head;
        	head = next;
        }
		
		return t;
    }
}
