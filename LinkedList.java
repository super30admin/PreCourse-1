  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
	Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor Setting th default data value and the node next value as null
        Node(int d) 
        { 
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
    	//Creating the Node
    	Node temp = new Node(data); 
        temp.next = null; 
        
        //Adding the node to the list if the list is null
        if(list.head != null) {
        	list.head = temp;
        }
        
        //Fetching the last node and then attaching the new node with it 
        else {
        	Node nextNode= list.head;
            while(nextNode.next != null) // Getting a null pointer exception (Tried to execute in the GFG also same exception)
                nextNode = nextNode.next;
            nextNode.next = temp;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to nextNode node 
    	Node current = list.head;
        while(current != null) {
    		System.out.println(current.data);
    		current = current.next;
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