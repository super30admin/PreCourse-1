// Time Complexity : O(n) n - length of the list
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Not available
// Any problem you faced while coding this : -


// Your code here along with comments explaining your approach
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
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
			this.data=d;
			//next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
		Node temp=new Node(data); 
		
   
        // If the Linked List is empty, 
        // then make the new node as head 
		if(list.head==null)
		{
			list.head=temp; // new node is head
			
		}
		else{
			// Else traverse till the last node 
            // and insert the new_node there 
			Node traverse=list.head; 
			while(traverse.next!=null)
			{
				
				traverse=traverse.next; // traversing till last before node
				
			}
            // Insert the new_node at last node
			traverse.next=temp;
		}
        
             
        // Return the list by head 
		return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
	    Node traverse=list.head;
        // Traverse through the LinkedList 
			while(traverse!=null)
			{
				// Print the data at current node 
				System.out.println(traverse.data);
				// Go to next node 
				traverse=traverse.next;
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