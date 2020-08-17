import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

	static Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			// Write your code here
			this.data = d; // assigning the data here..
			//this.next = null;
		}
	}

	public void insert(int data) {
		// Create a new node with given data

		// If the Linked List is empty,
		// then make the new node as head

		// Else traverse till the last node
		// and insert the new_node there

		// Insert the new_node at last node
		// Return the list by head
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
				
			}
			temp.next = newNode;
		}
	}

	// Method to print the LinkedList.
	public void printList() {
		// Traverse through the LinkedList

		// Print the data at current node

		// Go to next node
		if (null == head) {
			System.out.println("No node created");

		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}

	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedList list = new LinkedList();

		//
		// ******INSERTION******
		//

		// Insert the values
		list.insert(1);
		list.insert( 2);
		list.insert( 3);

		// Print the LinkedList
		list.printList();
	}
}