package easy;

import tool.ListNode;

public class DeleteLinkedlistNode {
	// Let given node be its next node
	public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }
}
