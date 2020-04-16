import java.io.*; 

//Java program to implement 
//a Singly Linked List 
public class LinkedList { 

 Node head; // head of list 


 static class Node { 

     int data; 
     Node next; 

     // Constructor 
     Node(int d) 
     { 
         data = d;
     } 
 } 

 // Method to insert a new node 
 public static LinkedList insert(LinkedList list, int data) 
 { 
     
	 Node newNode = new Node(data);
	 newNode.next = null;
	 
	 if(list.head == null)
	 {
		 list.head = newNode;
	 }
	 
	 else {
		 Node last = list.head;
		 while(last.next!=null)
		 {
			 last = last.next; 
		}
		 last.next = newNode;
	 }
	 
	return list;
     
 } 

 // Method to print the LinkedList. 
 public static void printList(LinkedList list) 
 {  
     Node currentNode = list.head;
     System.out.print("LinkedList: ");
     while(currentNode!=null)
     {
    	 System.out.print(currentNode.data + " ");
    	 currentNode = currentNode.next;
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
