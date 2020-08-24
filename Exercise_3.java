/*
 * Time Complexity: 
 * 	- insert() -> O (1)
 * 	- printList() -> O (N)
 * 
 * Space Complexity: O (N) -> To store N elements
 * 
 * Did this code successfully run on leetcode: Yes
 * 
 * Any problem you faced while coding this: No
 * 
 */

package com.s30.edu.precourse1;

//Java program to implement 
//a Singly Linked List 

public class Exercise_3 {
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
            //Write your code here 
        	this.data = d; // Initialize new node data
        	this.next = null; // Initialize next pointer of a new node to null
        } 
    } 
  
    
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    {
		
        // Create a new node with given data 
    	Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
    	if(list.head == null) {
    		list.head = newNode;
    	}
        // Else traverse till the last node 
        // and insert the new_node there 
    	else {
    		Node current = list.head;
    		
    		while(current.next != null) {
    			current = current.next;
    		}
    		// Insert the new_node at last node 
    		current.next = newNode;
    		
    	}

        // Return the list by head 
    	return list; 
        
    } 
  
    
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
    	// Set the head node as current node
    	Node current = list.head;
    	
    	
    	// Traverse through the LinkedList
    	while(current != null) {
    		// Print the data at current node 
    		System.out.print(current.data + " " + "-> ");
    		// Go to next node 
    		current= current.next;
    		
    	}
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
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
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        list = insert(list, 9);
        list = insert(list, 10);
  
        // Print the LinkedList 
        printList(list); 
    } 
    
}
