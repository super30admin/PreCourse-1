import java.io.*; 
  
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
            //Write your code here 
        	data = d;
        	next = null;
        } 
    } 
  
    // Method to insert a new node 
    @SuppressWarnings("null")
	public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
    	// Create a new node with given data 
    	Node n = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null) {
        	list.head = n;
        }else {
        	Node temp1 = list.head;
        	while(temp1.next != null) {
        		temp1 = temp1.next;
        	}
        	temp1.next = n;
        }
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
    		Node n1 = list.head;
            // Print the data at current node 
    		while(n1.next != null) {
    			System.out.print(n1.data+ "->");
    			n1 = n1.next;
    		}
    		System.out.println(n1.data);
            // Go to next node 
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