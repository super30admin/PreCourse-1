//time complexity - O(n)
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
         //Write your code here 
    	 data = d;
     } 
 } 

 // Method to insert a new node 
 public static LinkedList insert(LinkedList list, int data) 
 { 
     // Create a new node with given data 
	 Node temp,temp1;
	 temp = new Node(data);
	 //temp(data);
	 //temp.data = data;
	 
     // If the Linked List is empty, 
     // then make the new node as head 
	 if(list.head == null) {
		 
		 //temp = list.head;
		 list.head = temp;
		
	 }
	 
	 else {
		 temp1 = new Node(0);
		 temp1.next = list.head;
	 	
		 while (temp1.next != null){
		 temp1 = temp1.next;
		 
	 }
		 temp1.next = temp;
	 }
         // Else traverse till the last node 
         // and insert the new_node there 

         // Insert the new_node at last node 
     // Return the list by head 
     return list;
 } 

 // Method to print the LinkedList. 
 public static void printList(LinkedList list) 
 {  
     // Traverse through the LinkedList 

         // Print the data at current node 
	 Node temp1;
	 temp1 = new Node(0);
	 temp1 = list.head;
 	
	 while (temp1.next != null){
	System.out.println(temp1.data);
	 temp1 = temp1.next;
	 }
    
         // Go to next node 
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