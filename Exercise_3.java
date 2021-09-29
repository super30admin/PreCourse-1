import java.io.*; 


public class Precoursell2 {
	
    Node head; // head of list 
    
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    // Time Complexity
        // insert - O(n)
    // Space Complexity - O(n)
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
        	this.data = d;
        	this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static Precoursell2 insert(Precoursell2 list, int data) 
    { 
        // Create a new node with given data 
    	
    	Node tempNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
    	if(list.head == null) {
    		list.head = tempNode;
    	}else {
    		Node temp = list.head;
    		while(temp.next != null) {
    			temp = temp.next;
    		}
    		temp.next =tempNode;
    	}
        
    	return list;
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Precoursell2 list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
    	Node temp = list.head;
    	while(temp!=null) {
    		System.out.println(temp.data);
    		temp = temp.next;
    	}
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
    	Precoursell2 list = new Precoursell2(); 
  
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
