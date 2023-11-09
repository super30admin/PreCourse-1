// Time Complexity : O(N) where N is the number of elements in the list.
// Space Complexity : O(N) where N is the number of elements pushed to the list.
// Did this code successfully run on Leetcode : No, compilation error as LinkedList is being picked from inbuilt library
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

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
        /**
         * @param d
         * Initializes a node with the given data.
         * TC: O(1)
         */
        Node(int d) 
        { 
            //Write your code here 
        	this.data = d;
        	this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    /**
     * @param list
     * @param data
     * @return
     * Checks if the list's head is empty. if so, then sets head with this data.
     * Else, iterates through the end of the list and inserts the new node at last.
     * TC: O(N) where N is the number of elements in the list.
     */
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
    	
    	Node node = new Node(data);
    	if(list.head == null) {
    		list.head = node;
    	} else {
    		Node temp = list.head;
    		while(temp.next != null)
    			temp = temp.next;
    		temp.next = node;
    	}
        return list;
    } 
  
    // Method to print the LinkedList. 
    /**
     * @param list
     * Checks if the list's head is null, then prints empty list.
     * If not, then iterates over each node and prints the elements.
     * TC: O(N) where N is the number of elements in the list.
     */
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
    	if(list.head == null) {
    		System.out.println("Empty Linked List");
    		return;
    	}
    	Node temp = list.head;
    	while(temp != null) {
    		System.out.println("Current Node data: " + temp.data);
    		temp = temp.next;
    	}
    }  
}

public class Exercise_3 {
	// Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = LinkedList.insert(list, 1); 
        list = LinkedList.insert(list, 2); 
        list = LinkedList.insert(list, 3); 
        list = LinkedList.insert(list, 4); 
        list = LinkedList.insert(list, 5); 
  
        // Print the LinkedList 
        LinkedList.printList(list); 
    }
}