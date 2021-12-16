// Time Complexity : Insert: O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No Problem faced


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
            this.data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
    	Node temp = new Node(data);
    	temp.next = null;
        
    	// If the Linked List is empty, 
        // then make the new node as head
    	if(list.head==null) {
    		list.head = temp;
    	}
        
            // Else traverse till the last node 
            // and insert the new_node there 
    	else {
    		Node cur = list.head;
    		while(cur.next!=null) {
    			cur = cur.next;
    		}
    		// Insert the new_node at last node 
    		cur.next = temp;
    	}
    	// Return the list by head 
    	return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
    	Node cur = list.head;
    	while(cur!=null) {
    		// Print the data at current node
    		System.out.print(cur.data+"->");
    		// Go to next node 
    		cur = cur.next;
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