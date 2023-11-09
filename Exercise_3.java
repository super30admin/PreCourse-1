package learning;

import java.io.*; 

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
         this.next = null;
     } 
 } 

 // Method to insert a new node 
 public static LinkedList insert(LinkedList list, int data) 
 { 	
	 Node tmpHead = new Node(0);
	 Node tmp = new Node(data);
     // Create a new node with given data 

     // If the Linked List is empty, 
	   // then make the new node as head
	 if(list.head == null) {
		 list.head = tmp; 
	 }
	// Else traverse till the last node 
	 else	{
		 tmpHead = list.head;
		 while(list.head.next!=null) {
			 list.head = list.head.next;
		 }
		 // and insert the new_node there
		 // Insert the new_node at last node 
		 list.head.next = tmp;
		 // Return the list by head 
		 list.head = tmpHead;
	 }   
     
     
     return list;
 } 

 // Method to print the LinkedList. 
 public static void printList(LinkedList list) 
 {  	Node tmpHead = new Node(0);
     // Traverse through the LinkedList 
	 if(list.head == null)	{
		 System.out.println("STACK UNDERFLOW");
	 }
	 else	{
		 tmpHead = list.head;
		 while(list.head.next != null) {
			 // Print the data at current node 
			 System.out.println("data at current node: " + list.head.data );
			 // Go to next node 
			 list.head = list.head.next;
		 }
		 System.out.println("data at current node: " + list.head.data);
		 list.head = tmpHead;
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
     list = insert(list, 5); 
     list = insert(list, 4); 
     list = insert(list, 5); 

     // Print the LinkedList 
     printList(list); 
 } 
}