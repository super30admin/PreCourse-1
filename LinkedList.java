import java.io.*; 
  
//insert - Time complexity O(n) where n is number of nodes already 
//link list before inserting new node
//and Space Complexity O(1)
//print - Time complexity O(n) where n is number of nodes
//and Space Complexity O(1)
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
        	this.data=d;
        	next=null;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {
		
        // Create a new node with given data 
    	
    	Node temp= new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
		if(list.head==null)
		{
			list.head=temp;
			
		}
		else
		{
			Node last = list.head;
			//Else traverse till the last node 
			// and insert the new_node there 
			while(last.next!=null)
			{
				last=last.next;
				
			}
			last.next=temp;
		}
		
		return list;
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
    	
    	if(list==null)
    	{
    		System.out.println("no element in LinkedList");
    		
    	}
    	else
    	{
    		Node temp=list.head;
    		// Print the data at current node 
    	       
            // Go to next node 
    		while(temp!=null)
    		{
    			System.out.println(temp.data + " ");
    			temp=temp.next;
    		}
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
        list = insert(list, 5); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}