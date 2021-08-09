import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
    static Node head; // head of list 
    static Node current; //Pointer to the current node
  
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
    public static LinkedList insert(LinkedList list, int data) 
    { 
        
    	head = list.head;
    	current = head;
    	
    	if (head == null) {
    		Node temp = new Node(data);
    		head = temp;
    		list.head = head;
    		return list;
    	}
    	
    	
    	//Inserting at the headend of the list
    	/*temp.next = head.next;
    	head = temp;*/
    	
    	
    	// Inserting at the tailend of the list
    	while(current.next != null)
    	{
    		current = current.next;
    	}
    	Node temp = new Node(data);
    	current.next = temp;
    	
    	list.head = head;
    	return list;
  
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
    	head = list.head;
    	current= head;
    	while(current != null) 
    	{
    		System.out.println("Element is "+ current.data);
    		current= current.next;
    		
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