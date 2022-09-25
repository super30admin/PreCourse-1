// Java program to implement 
// a Singly Linked List 
// Time Complexity : O(N) for insert, O(N) for printlist
// Space Complexity : O(N) where N is number of elements in the list
// Any problem you faced while coding this : No.


/**
 * Implement Singly Linked List.
 * 
 * Upon insertion, we check if the head is null or not. If null, we assign the head to the newly created node. If not null,
 * we iterate till we reach the end of the linked list and assign the newly created to the 'next' of the last node.
 * 
 * For printing the list, we iterate over the list and print the 'data' field of the node till we encounter null node, i.e, 
 * we have reached the end of the linked list.
 */ 
class LinkedList { 

	Node head; // head of list 

	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) 
		{ 
			this.data = d;
		} 
	} 

	// Method to insert a new node 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		// Create a new node with given data 
		Node node = new Node(data);

		// If the Linked List is empty, 
		// then make the new node as head 
		
			// Else traverse till the last node 
			// and insert the new_node there 

			// Insert the new_node at last node 
		// Return the list by head 
		if (list.head == null) {
			list.head = node;
		}
		else {
			Node curr = list.head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = node;
		}

		return list;
	} 

	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{  
		// Traverse through the LinkedList 

			// Print the data at current node 
		
			// Go to next node 
		Node curr = list.head;
		System.out.println("Printing the linked list: ");
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
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