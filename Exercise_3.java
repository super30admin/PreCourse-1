import java.io.*; 
  
//spcace complecity= the amount of data stored increases linearly with the number of nodes in the list. Therefore, the space complexity of the linked list is linear:
o(1)
//time complexitu: 0(1) fo insertion
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
            //initializing
        	this.data =  d;
        	next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
    	// Create a new node with given data 
        Node new_node = new Node(data);
        new_node.next = null;
        
     
          // If the Linked List is empty, 
          // then make the new node as head 
         // Else traverse till the last node 
              // and insert the new_node there 
        
        if(list.head == null){
          list.head = new_node;
        }else{
          Node last = list.head;
          
          while(last.next!=null){
            last = last.next;
          }
          
           // Insert the new_node at last node 
          // Return the list by head 
          
          last.next = new_node;
          
        }
        return list;
    } 
        
  
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
    	 // Traverse through the LinkedList 
        Node currNode =list.head;
         System.out.print("LinkedList: "); 
           // Print the data at current node 
        // Traverse through the LinkedList 
       while (currNode != null) { 
           // Print the data at current node 
           System.out.print(currNode.data + " "); 
  
           // Go to next node 
           currNode = currNode.next; 
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