import java.io.*;


  
// Java program to implement 
// a Singly Linked List 
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
        	data=d;
        	next=null;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
 
        // Create a new node with given data 
    		Node newnode=new Node(data);
    		 // If the Linked List is empty, 
            // then make the new node as head 
    		if(list.head==null) {
    			list.head=newnode;
    			list.head.next=null;
    			
    		}
    		else
    		{
    			
    			Node loopnode=list.head;
    			// Else traverse till the last node 
                // and insert the new_node there 

    			while(loopnode.next!=null)
    			{
    				loopnode=loopnode.next;
    			}
    			loopnode.next=newnode;
    			newnode.next=null;
    			System.out.print("data "+loopnode.next.data);
    		}
    		return list;
       
        
            
            // Insert the new_node at last node 
      
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   Node loop=list.head;
    	while(loop!=null)
    	{
    		System.out.print("current node is"+loop.data);
    		loop=loop.next;
    	}
            // Print the data at current node 
       
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