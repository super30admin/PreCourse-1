// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Java program to implement 
// a Singly Linked List 
public class SinglyLinkedList {

	Node head; // head of list

	@Override
	public String toString() {
		return "SinglyLinkedList [head=" + head + "]";
	}

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			this.data = d;
			this.next = null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}

	// Method to insert a new node
	public static SinglyLinkedList insert(SinglyLinkedList list, int data) {
		// Create a new node with given data
		Node node = new Node(data);

		// If the Linked List is empty,
		// then make the new node as head
		if (null == list.head) {
			list.head = node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			Node temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			// Insert the new_node at last node
			temp.next = node;
		}
		// Return the list by head
		return list;

	}

	// Method to print the LinkedList.
	public static void printList(SinglyLinkedList list) {
		// Traverse through the LinkedList
		Node currNode = list.head;
		while (currNode != null) {
			// Print the data at current node
			System.out.print("<" + currNode.data + ">");
			// Go to next node
			currNode = currNode.next;
		}
	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		SinglyLinkedList list = new SinglyLinkedList();

		//
		// ******INSERTION******
		//

		// Insert the values
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);

		// Print the LinkedList
		printList(list);
	}
}