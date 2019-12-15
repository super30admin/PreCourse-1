import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedListUsingJava {

	static Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {
		int data;
		Node next;

		// Constructor
		Node(int d) {
			// Write your code here
			this.data = d;
		}
	}

	// Method to insert a new node
	public static LinkedListUsingJava insert(LinkedListUsingJava list, int data) {
		// Create a new node with given data

		Node node = new Node(data);
		// first node created node and it will point to head
		// If the Linked List is empty,
		// then make the new node as head
		if (list.head == null) {
			list.head = node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			Node temp;
			temp = list.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedListUsingJava list) {
		// Traverse through the LinkedList

		Node temp;
		temp = list.head;
		while (temp.next != null) {
		// Print the data at current node

			System.out.println(temp.data);
		// Go to next node
			
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedListUsingJava list = new LinkedListUsingJava();

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