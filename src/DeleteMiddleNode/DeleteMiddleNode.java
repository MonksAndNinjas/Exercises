/*
 * Delete Middle Node: Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node.
 * It can be any node between first and last element.
 */

package DeleteMiddleNode;

import LinkedListNode.LinkedListNode;

public class DeleteMiddleNode {
	public static boolean deleteNode(LinkedListNode n) {
		if (n == null || n.next == null) {
			return false; // Failure
		}
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode second = new LinkedListNode(2);
		LinkedListNode third = new LinkedListNode(3);
		LinkedListNode fourth = new LinkedListNode(3);
		
		head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		
		boolean didDelete = deleteNode(head);
		
		System.out.print(didDelete + " ");
	}
}
