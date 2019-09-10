package LinkedList;

public class LinkedList {
	Node head;
	
	static class Node {
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
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(3);
		
		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		
		llist.printList();
	}
}
