import java.io.*; 

/**
 * Exercise_3 : Implement Singly Linked List.
 * Time - Insertion = O(n) Print = O(n)
 * Space = O(n) for n nodes
 * Did this code successfully run on Leetcode: Ran locally
 * 
 * Notes: 
 * Any problem you faced while coding this?
 * list.head == null vs list == null for checking if list is empty
 * list is a reference to the whole LinkedList object in memory.
 * Even if the list has no nodes, list is not null — 
 * it’s pointing to a LinkedList object that just happens to have head == null.
 */
  
// Java program to implement a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. This inner class is made static so that main() can access it 
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
        Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node and insert the new node there 
            Node last = list.head; 
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node 
            last.next = newNode;
        }
        // Return the list by head 
        return list;   
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node current = list.head; // Start at the head

        while (current != null) { // Traverse until the end of SLL
            System.out.print(current.data + " "); // Print current node's data
            current = current.next; // Go to next node
        }

        System.out.println(); // Print a new line at the end
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