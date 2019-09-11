/*
 * Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 */

package ReturnLast;

import LinkedListNode.LinkedListNode;

public class ReturnLast {

	/* If linked list size is known */
	
	public static LinkedListNode knownSize(LinkedListNode n, int k, int l) {
		/* k is element to be returned; l is length of Linked list n*/
		int kLength = l - k;
		for (int i = 0; i < kLength; i++) {	
			if (i != kLength) {
				n = n.next;
			};
		}
		return n;
	}
	
	/* Iterative solution */
	
	public static LinkedListNode kthToLast(LinkedListNode head, int k) {
		LinkedListNode p1 = head;
		LinkedListNode p2 = head;
		
		/* Move p1 k nodes into the list. */
		for (int i = 0; i < k; i++) {
			if (p1 == null) return null; // Out of bounds
			p1 = p1.next;
		}
		
		/* Move them at the same pace. When p1 hits the end, p2 will be at the right element. */
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode second = new LinkedListNode(2);
		LinkedListNode third = new LinkedListNode(3);
		LinkedListNode fourth = new LinkedListNode(3);
		
		head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		
		int kth = 1;
		
		LinkedListNode nodeK = knownSize(head, kth, 4);
		LinkedListNode iterK = kthToLast(head, kth);
		
		System.out.print(nodeK.data + " : I'm " + kth + " from the end! " + "Known length /");
		System.out.print(iterK.data + " : I'm " + kth + " from the end!" + " Unknown length " );
	}	
}	