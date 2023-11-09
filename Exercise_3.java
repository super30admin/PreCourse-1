import java.io.*; 
  
//Java program to implement 
//a Singly Linked List 

/*
 * * Time Complexity:
 * 1. insert - O(1)
 * 2. print list - O(n)
 * 
 * 
 * Space Complexity:
 * 1. insert - O(n) 
 * 2. print list - O(n)
 * 
 * space complexity is calculated considering 
 * space required for arguments + space required for variables declared in respective methods
 * 
 * 
 * This code will run successfully on Leetcode
 * 
 * Any problems you face while coding this - No
 * 
 * Approach: 
 * Using a pointer top to implement FIFO pattern. top is initialized to -1. 
 * on every push operation top will be incremented first and then element will be inserted.
 * 
 * 1. when Linkedlist is created both head and pointer is null. This shows list is empty
 * 2. For each insert operation, we create a node with data value coming as argument called node
 * 	  Then we check if list is empty (ie if head = null). 
 * 	  If list is empty then node is head of list and pointer is also node 
 * 	  else we make our pointer's next to point at node and we bring pointer to pointer.next
 * 3. For printing entire list, we make use of head node. We iterate from head node which 
 * 	  is pointing to 1st node of list to pointer node which is pointing to last node of list.
 */
public class LinkedList {

	Node head; // head of list
	Node pointer;

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
	}

	// Method to insert a new node
	public static LinkedList insert(LinkedList list, int data) {
		// Create a new node with given data
		Node node = new Node(data);
		
		// If the Linked List is empty,
		// then make the new node as head
		if(list.head == null) {
			list.head = node;
			list.pointer = list.head;
		}else {
			// Else traverse till the last node
			// and insert the new_node there
			list.pointer.next = node;
			list.pointer = list.pointer.next;
		}
		// Insert the new_node at last node
		// Return the list by head
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedList list) {
		// Traverse through the LinkedList
		// Print the data at current node
		// Go to next node
		Node start = list.head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
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
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);

		// Print the LinkedList
		printList(list);
	}
}