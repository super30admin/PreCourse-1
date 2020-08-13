import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
	  
    static Node head; 
    static Node temp = head;
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
           data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
    	
    	
    	Node n = new Node(data);
    	
    	if(head == null)
    		head = n;
    	else
    	{
    		 temp = head;
    		while(temp.next != null)
    		{
    			temp = temp.next;
    		}
    		temp.next = n;
    		
    	}
    	return list;	
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
    	 temp = head;
    	
    	while(temp != null)
    	{
    		System.out.println(temp.data);
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