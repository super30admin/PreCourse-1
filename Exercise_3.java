//Time Complexity: O(N)
//Space Complexity: O(N)

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
        static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
        	this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
    	Node createNode = new Node(data);
	    	if(list.head == null) {
    		list.head = createNode;
    	}
        
            // Else traverse till the last node 
            // and insert the new_node there 
    		// Insert the new_node at last node
    	else {
    		Node tempNode = list.head;
    		while(tempNode.next!=null) 
    			tempNode = tempNode.next;
    			tempNode.next = createNode;
    	}
    	// Return the list by head
    	return list;
 } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        // Print the data at current node 
       // Go to next node
    	Node traverseNode = list.head;
    	while(traverseNode!=null) {
    		System.out.println(traverseNode.data + " ");
    		traverseNode = traverseNode.next;
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
