package precourse1;

import java.io.*; 
  

public class ImpSinglyLinkedList { 
  
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
        	data = d;
        	next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static ImpSinglyLinkedList insert(ImpSinglyLinkedList list, int data) 
    { 
        // Create a new node with given data 
    	Node newNode = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head
    	if(list.head == null) {
    		list.head = newNode;
    	}else {
    		// Else traverse till the last node 
            // and insert the new_node there
    		
    		Node temp = list.head;
    		while(temp.next != null) {
    			temp = temp.next;
    		}
    		temp.next = newNode;
    	} 
    	return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(ImpSinglyLinkedList list) 
    {  
        // Traverse through the LinkedList 
    	Node temp = list.head;
   
            // Print the data at current node
    	while(temp != null) {
    		System.out.println(temp.data+" ");
    		// Go to next node 
    		temp = temp.next;
    	}
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
    	ImpSinglyLinkedList list = new ImpSinglyLinkedList(); 
  
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