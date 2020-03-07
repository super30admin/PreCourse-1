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
            this.next = null;
        } 
    } 
    
    LinkedList()
    {
    	head = new Node(Integer.MAX_VALUE);
    }
    //the head is a dummy node which points to first node in linked list
    //data field of head is not used
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node nodeToBeInserted = new Node(data);
        
        if(list.head.next == null)
        {
        	list.head.next = nodeToBeInserted;
        	return list;
        }
    
        Node temp = list.head.next;
        while(temp.next != null)
        {
        	temp = temp.next;
        }
        temp.next = nodeToBeInserted;
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
    	Node temp = list.head.next;
    	while(temp != null)
    	{
    		System.out.println(temp.data);
    		temp = temp.next;
    	}
    	return;
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