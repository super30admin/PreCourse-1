import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 

// Space Complexity : Insert & display - O(n)
// Time Complexity : Insert & display -  O(n)
public class LinkedList { 
  
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
            this.data=d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
    	 Node newNode = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
    	 if(list.head==null){
             list.head=newNode;
             newNode.next=null;
         }else{
             
             Node curr = list.head;
        
            // Else traverse till the last node 
             while(curr.next!=null){
                 curr=curr.next;
             }
            // and insert the new_node there 
             curr.next=newNode;

            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
    	 while(list.head!=null){
            // Print the data at current node 
    		    System.out.println("data"+list.head.data);
            // Go to next node 
    		    list.head=list.head.next;
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