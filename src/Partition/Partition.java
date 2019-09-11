/*
 * Partition: Write code to partition a linked list around a value x,
 * such that all nodes less than x come before all nodes greater than or equal to x.
 * If x is contained within the list, the values of x only need to be after the elements less than x.
 * The partition element x can appear anywhere in the "right partition";
 * it does not need to appear between the left and right partitions.
 * 
 * EXAMPLE
 * 
 * Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
 * Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */

package Partition;

import LinkedListNode.LinkedListNode;

public class Partition {
	public static LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode head = node;
		LinkedListNode tail = node;
		
		while (node != null) {
			LinkedListNode next = node.next;
			if (node.data < x) {
				/* Insert node at head. */
				node.next = head;
				head = node;
			} else {
				/* Insert node at tail. */
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		
		// The head has changed, so we need to return it to the user.
		return head;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode second = new LinkedListNode(13);
		LinkedListNode third = new LinkedListNode(9);
		LinkedListNode fourth = new LinkedListNode(3);
		
		head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		
		LinkedListNode result = partition(head, 9);
		
		System.out.print(result.data + " -> " + result.next.data + " -> " + result.next.next.data + " -> " + result.next.next.next.data);
	}
}
