import java.io.*;

// Time Complexity : O(n); n = #nodes in linkedlist
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Not found on leetcode
// Any problem you faced while coding this : No


// Java program to implement 
// a Singly Linked List 
class LinkedList {
  
    static Node head; // head of list
  
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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head
        if (head == null) {
            head = node;
            return list;
        }
        
        // Else traverse till the last node
        // and insert the new_node there
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        // Insert the new_node at last node
        curr.next = node;
        curr = curr.next;


        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node curr = head;
        while (curr != null) {
            // Print the data at current node
            System.out.print(+curr.data+"\t");
            // Go to next node
            curr = curr.next;
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