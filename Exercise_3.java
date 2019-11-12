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
        	this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
    	Node dummyNode = new Node(data);
    	
    	// If the Linked List is empty, 
    	if(list.head == null) {
    		list.head = dummyNode;
    	}
        // then make the new node as head 
    	else {
    		// Else traverse till the last node 
            Node traverseNode = list.head;
    		while(traverseNode.next != null) {
    			traverseNode = traverseNode.next;
    		}
    		// and insert the new_node there 
            // Insert the new_node at last node 
    		traverseNode.next = dummyNode;
    		//list.head = traverseNode;
    	}
            
        // Return the list by head 
    	return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
    		Node traverseNode = list.head;
    		while(traverseNode != null) {
    			// Print the data at current node 
    		    System.out.println("Current Node Data:" + traverseNode.data);  
                // Go to next node 
    		    traverseNode = traverseNode.next;
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