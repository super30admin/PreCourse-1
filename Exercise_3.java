  
// Java program to implement 
// a Singly Linked List 
 class LinkedList { 
  
     Node head; // head of list 
     Node tail;
  
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
        	next = null;
        }

    }
    
	// Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
    	Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
    	if (list.head == null) {
    		list.head = newNode;
    		list.tail = newNode;
    	} else {
    		// Else traverse till the last node 
            // and insert the new_node there 
    	//	Node last = list.head;
    	//	while (last.next != null) { // O(n)
    		//	last = last.next;
    		//}
    		list.tail.next = newNode; // current tail points to the new node  O(1)
    		list.tail = newNode; //new node becomes the tail
    		
    		// Insert the new_node at last node 
        	//last.next = newNode; 
    	}
            
        // Return the list by head 
    	return list;
    } 
  
    // Method to print the LinkedList. 
    public void printList(LinkedList list) 
    {  
    	Node currNode = list.head; 
    	   
        System.out.print("LinkedList: "); 
        // Traverse through the LinkedList 
   
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    }
    
    public static LinkedList removeLast(LinkedList list, int data) {
    	if(list.head.data == data && list.head.next == null) {
    		list.head = null;
    	} else {
    		Node currentNode = list.head;
    		while(currentNode.next.next != null) {
    			currentNode = currentNode.next;
    		}
    		currentNode.next = null;
    	}
    	return list;
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
        list = removeLast(list, 5);
  
        // Print the LinkedList 
        list.printList(list); 
    } 
}