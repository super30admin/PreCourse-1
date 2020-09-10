//Time Complexity : O(1)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : haven't tried
//Any problem you faced while coding this : I understand the logic but still not intuitive


//Your code here along with comments explaining your approach 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
    static Node head; // head of list 
  
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
        	this.next = null;
        	System.out.println("data: " + data);
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
    	Node newnode = new Node(data);
    	
        // If the Linked List is empty, 
        // then make the new node as head 
    	if (LinkedList.head == null) {
    		LinkedList.head = newnode;
    	} else {
    		// Else traverse till the last node 
            // and insert the new_node there 
    		Node lastnode = LinkedList.head;
    		//System.out.println("LinkedList.head: " + LinkedList.head.data);
    		
    		while (lastnode.next != null) {
    			lastnode = lastnode.next;
    			//System.out.println("lastnode : " + lastnode.data);
    		}
    		// Insert the new_node at last node 
    		lastnode.next = newnode;
    	}
        // Return the list by head 
    	return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node currentnode = LinkedList.head;
		// Traverse through the LinkedList 
    	while (currentnode  != null) {
            // Print the data at current node 
    		System.out.print(currentnode.data + " ");
            // Go to next node 
    		currentnode = currentnode.next;
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


