// Time Complexity : Worst case : O(n) 
// Space Complexity :Worst case : O(MAX)
// Did this code successfully run on Leetcode : It runs successfully on Eclipse
// Any problem you faced while coding this : Not much, other than coding for insertion

// Java program to implement 
// a Singly Linked List 
public class Exercise_3 { 
  
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
        	this.data = d;
        	this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null)
        {
        	Node newNode = new Node(data);
        	newNode.next = list.head;
        	list.head = newNode;
        }
            // Else traverse till the last node 
            // and insert the new_node there 
        else
        {
        	Node current = list.head;
        	while(current.next != null)
        	{
        		current = current.next;
        	}
            // Insert the new_node at last node 
        	Node newNode = new Node(data);
        	current.next = newNode;
        }

        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
    	Node current = list.head;
        // Traverse through the LinkedList 
    	while(current != null)
    	{
            // Print the data at current node 
    		System.out.println(current.data);
    		  // Go to next node 
    		current = current.next;
    	}
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3(); 
  
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
