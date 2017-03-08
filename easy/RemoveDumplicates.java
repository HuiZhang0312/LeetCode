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
public class RemoveDumplicates {
	// **********************First solution********Iterative*******************
    public ListNode deleteDuplicates(ListNode head) {
    	// If list is null, return null.
    	if(head==null){
            return null;
        }
    	// Use a pointer
        ListNode p = head;
        while(p.next!=null){
        	// If duplicate, delete the second one. Else point to next node.
            if(p.val==p.next.val){
                p.next=p.next.next;
            }else{
                p = p.next;
            }  
        }
        return head;
    }
    
    // *********************Second solution*******Recursive*******************
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null)return head;
//        head.next = deleteDuplicates(head.next);
//        return head.val == head.next.val ? head.next : head;
//    }
}
