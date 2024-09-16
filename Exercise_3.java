// Time complexity o(n) as we are traversing thru list for both insert and print operations
// Space complexity o(n) for storing n items in list.

import java.io.*; 
  
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
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here 
          this.data = d;
          this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
      Node n = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
      // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
      if(list.head == null) {
        list.head = n;
      } else {
        Node pointer = list.head;
        while(pointer.next !=null) {
          pointer = pointer.next;
        }
        pointer.next = n;
      } 
      
      return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
      Node pointer = list.head;
      System.out.print("Data in list is: ");
        while(pointer !=null) {
          System.out.print(" " + pointer.data);
          pointer = pointer.next;
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
