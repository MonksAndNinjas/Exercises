/*
 * Remove Dups: Write code to remove duplicates form an unsorted linked list.
 * 
 * How would you solve this problem if a temporary buffer is not allowed?
 */

package RemoveDups;
import LinkedListNode.LinkedListNode;
import java.util.HashSet;

public class RemoveDups {
	static void deleteDups(LinkedListNode n) {
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode previous = null;
		while (n != null) {
			if (set.contains(n.data)) {
				System.out.print("delete" + " " + n.data + " ");
				previous.next = n.next;
			} else {
				System.out.print("");
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}
	
	public void noBufferDeleteDups(LinkedListNode head) {
		LinkedListNode current = head;
		while (current != null) {
			/* Remove all future nodes that have the same value */
			LinkedListNode runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListNode head = new LinkedListNode(1);
		LinkedListNode second = new LinkedListNode(2);
		LinkedListNode third = new LinkedListNode(3);
		LinkedListNode fourth = new LinkedListNode(3);
		
		head.setNext(second);
		
		second.setNext(third);
		second.setPrevious(head);
		
		third.setPrevious(second);
		third.setNext(fourth);
		
		deleteDups(head);
	}
}