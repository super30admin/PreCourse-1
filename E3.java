package precourse1;

//Time Complexity : O(1)
//Space Complexity : O(n)
//Any problem you faced while coding this : No

// Java program to implement 
// a Singly Linked List 
public class Exercise_3 { 
  
    public Node head; // head of list 
  
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
        	data=d;
        	next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    {
        // Create a new node with given data 
    	Node node=new Node(data);
    	node.next=null;
        // If the Linked List is empty, 
        // then make the new node as head 
    	if(list.head==null) {
    		list.head=node;
    	}else {
    		// Else traverse till the last node 
    		// and insert the new_node there     	
    		Node last=list.head;
    		while(last.next!=null) {
    			last=last.next;
    		}
    		last.next=node;
    	}
            // Insert the new_node at last node 
        // Return the list by head 
    	return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
    	Node node=list.head;
        // Traverse through the LinkedList 
    	while(node!=null) {
    		// Print the data at current node     		
    		System.out.println(node.data);
    		node=node.next;
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