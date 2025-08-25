import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
     Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data=d;
        } 
    } 
  
    // Method to insert a new node 
    //Time Complexity- O(n)
    public  LinkedList insert(LinkedList list, int data) 
    { 
        Node newNode= new Node(data);
   
        if(list.head== null) {
         list.head=newNode;
        }
        else {
        Node curr=list.head;
        while(curr.next!=null) {
        	curr=curr.next;
        }
        curr.next= newNode;
        }
        return list;
        
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList.
    //Time Complexity- O(n)
    public  void printList(LinkedList list) 
    {  
    	Node curr=list.head;
    	while(curr.next!=null) {
    		System.out.println(curr.data + ",");
    		curr=curr.next;
    	}
    	System.out.println(curr.data);
    	
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
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
        list = list.insert(list, 1); 
        list = list.insert(list, 2); 
        list = list.insert(list, 3); 
        list = list.insert(list, 4); 
        list = list.insert(list, 5); 
  
        // Print the LinkedList 
        list.printList(list); 
    } 
}