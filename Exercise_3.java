// Time Complexity : Insert: O(1) print: O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

/**
 * 1. Create a node class to hold data and next node.
 * 2. Hold pointer to first element in the list to print data.
 * 
 */
 
// Java program to implement 
// a Singly Linked List 
class LinkedList {

	Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			this.data = d;
		}
	}

	// Method to insert a new node
	public static LinkedList insert(LinkedList list, int data) {
		// Create a new node with given data
		Node newNode = new Node(data);

		// If the Linked List is empty,
		// then make the new node as head

		if (list.head == null) {
			list.head = newNode;
		}

		// Else traverse till the last node
		// and insert the new_node there
		else {
			Node temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}

		return list;

	}

	// Method to print the LinkedList.
	public static void printList(LinkedList list) {
		// Traverse through the LinkedList

		Node temp = list.head;
		while (temp != null)
		{
			// Print the data at current node
			System.out.println(temp.data);
			// Go to next node
			temp = temp.next;
		}
	}

}

public class Exercise_3 {
	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedList list = new LinkedList();

		//
		// ******INSERTION******
		//

		// Insert the values
		list = LinkedList.insert(list, 1);
		list = LinkedList.insert(list, 2);
		list = LinkedList.insert(list, 3);
		list = LinkedList.insert(list, 4);
		list = LinkedList.insert(list, 5);

		// Print the LinkedList
		LinkedList.printList(list);
	}

}