// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Was not sure if should use a tail pointer or should iterate till last node.

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    static Node head; // head of list 
    static Node tail; // tail of list
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data=d; 
        } 
    } 
  
    // Method to insert a new node 
    public static Node insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
	Node newnode=new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
	if(head==null) {
	    head=newnode;
	    tail=newnode;
	}else {
	 // Else traverse till the last node 
            // and insert the new_node there 
	    //we have tail pointer so add next to tail pointer
	 // Insert the new_node at last node.
	    tail.next=newnode;
	    tail=newnode;
	}
             
        // Return the list by head 
	return head;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Node list) 
    {  
	Node head=list;
        // Traverse through the LinkedList 
	while(head!=null) {
	 // Print the data at current node
	    System.out.println(head.data);
	 // Go to next node 
	    head=head.next;
	}    
	
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
        Node head;
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        head = LinkedList.insert(list, 1); 
        head = LinkedList.insert(list, 2); 
        head = insert(list, 3); 
        head = insert(list, 4); 
        head = insert(list, 5); 
  
        // Print the LinkedList 
        printList(head); 
    } 
}