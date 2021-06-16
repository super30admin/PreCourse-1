// Time Complexity : O(n) to insert 
// Space Complexity : O(n) -> n is the list size
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No

// Java program to implement 
// a Singly Linked List 
public class Exercise_3 {
	Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			// Initialize node
			this.data = d;
			this.next = null;
		}
	}

	// Method to insert a new node
	public static Exercise_3 insert(Exercise_3 list, int data) {
		Node newNode = new Node(data);
		// If the list is empty, set head as the node to be inserted.
		if (list.head == null) {
			list.head = newNode;
			return list;
		}

		// Traverse through the list, until the last node is reached
		Node listNode = list.head;
		while (listNode.next != null) {
			listNode = listNode.next;
		}

		// Add the node to the end of the list.
		listNode.next = newNode;
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(Exercise_3 list) {
		// Traverse through the list and print each node value
		Node listNode = list.head;
		while (listNode != null) {
			System.out.print(listNode.data + " -> ");
			listNode = listNode.next;
		}
		System.out.print(" NULL ");
	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		Exercise_3 list = new Exercise_3();

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
