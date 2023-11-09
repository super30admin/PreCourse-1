//Precourse 1: Exercise 3    --  Implementing Singly Linked List 
//1441. Build an Array With Stack Operations
// Time Complexity : O(n), inserting and traversing will take O(n) times as both needs traversal. 
// Space Complexity : O(n) required for storing n elements
// Any problem you faced while coding this : no

/*Output
The Linkedlist is empty
The elements of Linked List are: 
[1]->[2]->[3]->[4]->[5]->*/


public class SinglyLinkednList {

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
	        	this.data=d;
	        	this.next=null;
	        } 
	    } 
	  
	    // Method to insert a new node 
	    public static SinglyLinkednList insert(SinglyLinkednList list, int data) 
	    { 
	        // Create a new node with given data 
	    	Node node=new Node(data);
	        // If the Linked List is empty, 
	    	if(list.head == null) {
	    	System.out.println("The Linkedlist is empty");
	    	list.head=node;  // then make the new node as head
	    	}
	    	else {
	    	// Else traverse till the last node 
	    		// and insert the new_node there
	    	Node tail=list.head;
	    	while(tail.next != null) {
	    		tail=tail.next;
	    	}   	
	    	// Insert the new_node at last node
	    	tail.next=node;
	    	}
	        // Return the list by head 
	    	return list;
	    } 
	  
	    // Method to print the LinkedList. 
	    public static void printList(SinglyLinkednList list) 
	    {  
	    	Node curr= list.head;
	    	System.out.println( "The elements of Linked List are: " );
	        // Traverse through the LinkedList 
	    	while(curr != null) {
	    		
	    		// Print the data at current node 
		    	System.out.print("["+ curr.data +"]->");
	            // Go to next node 
	    	curr=curr.next;
	    	}
	    } 
	   
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	        /* Start with the empty list. */
	    	SinglyLinkednList list = new SinglyLinkednList(); 
	  
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
