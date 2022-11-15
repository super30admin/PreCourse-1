import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
//Time Complexity : O(n) for all operations, as we would have to traverse through each elements of the linked list
//Space Complexity : O(n) 
//Did this code successfully run on Leetcode :
//Any problem you faced while coding this : no


//Your code here along with comments explaining your approach


class LinkedList { 
	  
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
  public static LinkedList insert(LinkedList list, int data) 
  { 
      // Create a new node with given data 
  	Node newNode = new Node(data);
  	
  	 if(list.head == null) {// If the Linked List is empty, 
  		 list.head = newNode;// then make the new node as head
  	 }else {
  		// Else traverse till the last node 
           // and insert the new_node there 
  		 Node node = list.head;
  		 
  		 while(node.next!=null) {
  			 node = node.next;
  		 }
  		
  		// Insert the new_node at last node
  		 node.next = newNode;
  	 }
      // Return the list by head 
  	 return list;
      
  } 

  // Method to print the LinkedList. 
  public static void printList(LinkedList list) 
  {  
      
  	 Node node = list.head;
  	 
  	 while(node!=null) {// Traverse through the LinkedList 
  		 System.out.println(node.data);// Print the data at current node 
  		 node = node.next; // Go to next node 
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