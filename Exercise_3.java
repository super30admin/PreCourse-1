/*

Time Complexity
insert at beginning	- O(1)
Insert at end (your code) - O(n)
Print entire list - O(n)
Access head	- O(1)
Search for an element - O(n)


Space Complexity : O(n)

*/



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
            this.data = d;  //every node contains data.
            this.next = null;  //refers to the next node in the list.   
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) {      // Else traverse till the last node 
            list.head = new_node;   
        } else{
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;      // and insert the new_node there 
        }

            // Insert the new_node at last node 

        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node current = list.head;
        while (current != null) {       
   
            // Print the data at current node 
            System.out.print(current.data + " "); 
       
            // Go to next node 
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