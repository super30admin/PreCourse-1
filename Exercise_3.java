import java.io.*; 
  
//Time Complexity :   Insert and printList O(n) where n is the number of elements already in the linked list.
//Space Complexity : O(1) Individual Methods does not take up any space, however, 
//the LinkedList has O(n) where n is the number of elements in it.
//Did this code successfully run on LeetCode : No
//Any problem you faced while coding this : No 

//Java program to implement 
//a Singly Linked List 
public class LinkedList { 
	
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
		Node newNode = new Node(data);
	  // If the Linked List is empty, 
	  // then make the new node as head
		if(list == null) {
			list = new LinkedList();
			list.head = newNode;
		}
		else if(list.head == null) {
			list.head = newNode;
		}
		else {
			Node newhead = list.head;
			// Else traverse till the last node 
	     // and insert the new_node there 
			while(newhead.next!= null ) newhead = newhead.next;
			newhead.next = newNode;
		}
		// Return the list by head 
	  return list;     
	} 
	
	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{  
		Node currHead = list.head;
	 // Traverse through the LinkedList 
		while(currHead != null) {
	     // Print the data at current node 
			System.out.print(currHead.data + ", ");
	     // Go to next node 
			currHead = currHead.next;
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
