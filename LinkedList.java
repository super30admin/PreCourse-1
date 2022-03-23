package precourse1;
//time complexity: insert: O(1) or O(n), printList: O(n)
//space complexity: O(n)
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
     Node(int data) 
     { 
         //Write your code here 
     	this.data= data;
     	this.next= null;
     } 
 } 

 // Method to insert a new node 
 public static LinkedList insert(LinkedList list, int data) 
 { 
	 if(list.head == null) {
		 list.head = new Node(data);
	 }
	 else {
		 Node current = list.head;
		 while(current.next!= null) {
			 current= current.next;
		 }
		 current.next= new Node(data);
	 }
	return list;
 } 

 // Method to print the LinkedList. 
 public static void printList(LinkedList list) 
 {  	 
	 Node temp = list.head;
	 while(temp!= null) {
		 System.out.println(temp.data + " ");	
		 temp = temp.next;
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