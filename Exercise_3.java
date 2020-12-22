import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 

 Node head;

 static class Node { 

     int data; 
     Node next; 

     // Constructor 
     Node(int d) 
     { 
         this.data=d;
         this.next=null;
     } 
 } 

 // Method to insert a new node 
 public static LinkedList insert(LinkedList list, int data) 
 { 
     // Create a new node with given data 
	 Node newNode=new Node(data);

     // If the Linked List is empty, 
     // then make the new node as head 
	 if(list.head==null) {
		 list.head=newNode;
		 return list;
	 }
     
	 Node temp=list.head;
	 while(temp.next!=null) {
		 temp=temp.next;
	 }
	 temp.next=newNode;
         // Else traverse till the last node 
         // and insert the new_node there 

         // Insert the new_node at last node 
     // Return the list by head 
	 return list;
     
 } 

 // Method to print the LinkedList. 
 public static void printList(LinkedList list) 
 {  
	 Node temp=list.head;
	 
     // Traverse through the LinkedList 
	 while(temp.next!=null) {
		 System.out.println(temp.data);
		 temp=temp.next;
	 }
     System.out.println(temp.data);
         // Print the data at current node 
    
         // Go to next node 
 } 

 // Driver code 
 public static void main(String[] args) 
 { 

     LinkedList list = new LinkedList(); 

     list = insert(list, 1); 
     list = insert(list, 2); 
     list = insert(list, 3); 
     list = insert(list, 4); 
     list = insert(list, 5); 


     printList(list); 
 } 
}
