package PreCourse_1;
import java.io.*; 

//Time complexity is O(n) for insert operation & space complexity is O(1).
/*Approach : Create a node class which has data and next pointer. 
Create a new node with the data and when head is null make the new node as head. 
Traverse the list otherwise and  insert the new node at the end of list and return list
*/

public class ImplementSinglyLinkedList {
	  
	// Java program to implement 
	// a Singly Linked List 	  
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
	    public static ImplementSinglyLinkedList insert(ImplementSinglyLinkedList list, int data) 
	    { 
	        // Create a new node with given data 
	    	Node newNode = new Node(data);
	    	newNode.next = null;
	   
	        // If the Linked List is empty, 
	        // then make the new node as head 
	    	if(list.head == null) {
	    		list.head = newNode;
	    	}
	        
	            // Else traverse till the last node 
	            // and insert the new_node there 
	    	else {
	    	Node lastNode = list.head;
	    	while(lastNode.next != null) {
	    		lastNode = lastNode.next;
	    	}
	    	lastNode.next = newNode;
	    	}
	            // Insert the new_node at last node 
	        // Return the list by head
	    	return list;
	    		        
	    } 
	  
	    // Method to print the LinkedList. 
	    public static void printList(ImplementSinglyLinkedList list) 
	    {  
	        // Traverse through the LinkedList 
	    	Node currentNode = list.head;
	            // Print the data at current node 
	    	while(currentNode!=null) {
	    		System.out.println("Printing list"+ currentNode.data + " ");
	       
	            // Go to next node 
	    	currentNode = currentNode.next;
	    	}
	    } 
	   
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	        /* Start with the empty list. */
	    	ImplementSinglyLinkedList list = new ImplementSinglyLinkedList(); 
	  
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
