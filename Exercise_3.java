/*insert() : TC: O(n) SC:O(1)
   printList() : TC: O(n) SC:O(1) */
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
    Node head = null; // head of list 
  
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
           this.next = null; //Write your code here 
        }

    } 
    
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node temp = new Node(data);// Create a new node with given data 
        if(list.head == null){
            list.head = temp;
        }
        else{
            Node top = list.head;
            while(top.next!=null)
                top = top.next;
            top.next = temp;
        }
        return list;
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node top = list.head;
        while(top!=null){
            System.out.println(top.data);
            top=top.next;
        }
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
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}