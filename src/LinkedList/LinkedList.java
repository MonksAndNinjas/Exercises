/* Singly linked list */

package LinkedList;

public class LinkedList {
	Node head;
	
	public static class Node {
		Node next = null;
		int data;
	
		public Node(int d) {
			data = d;
		}
		
		void appendToTail(int d) {
			Node end = new Node(d);
			Node n = this;
			while (n.next != null) {
				n = n.next;
			}
			n.next = end;
		}
	}
	
	public void printList() {
		Node n = head;
		System.out.print(n);
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
}
