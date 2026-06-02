import java.io.*;

public class MyLinkedList {

	// Time Complexity : O(n)
	// Space Complexity : O(n)
	// Did this code successfully run on Leetcode : Yes
	// Any problem you faced while coding this : No

	Node head;

	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			this.data = d;
		}
	}

	// Method to insert a new node
	public static MyLinkedList insert(MyLinkedList list, int data) {
		// Create a new node with given data
		Node node = new Node(data);
		if (list.head == null) {
			list.head = node;
		} else {
			Node n = list.head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

		return list;
	}

	// Method to print the LinkedList.
	public static void printList(MyLinkedList list) {
		Node n = list.head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		MyLinkedList list = new MyLinkedList();

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