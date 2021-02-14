package com.sthirty.precourseone.prblmthree;

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
			data = d;
			next = null;
		}
	}

	// Method to insert a new node
	public static Exercise_3 insert(Exercise_3 list, int data) {

		if (list.head == null) {
			list.head = new Node(data);
		} else {
			Node temp = new Node(data);

			temp.next = list.head;
			list.head = temp;

		}

		return list;
		// Create a new node with given data

		// If the Linked List is empty,
		// then make the new node as head

		// Else traverse till the last node
		// and insert the new_node there

		// Insert the new_node at last node
		// Return the list by head

	}

	// Method to print the LinkedList.
	public static void printList(Exercise_3 list) {
		// Traverse through the LinkedList

		// Print the data at current node

		// Go to next node
		while (list.head != null) {
			System.out.println(list.head.data);

			list.head = list.head.next;
		}
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