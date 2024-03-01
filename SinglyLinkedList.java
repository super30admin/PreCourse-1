// Time Complexity:
// insert operation: O(n) 
// printList operation: O(n)

// Space Complexity: O(n)

import java.io.*;
import java.util.LinkedList; 
  
// Java program to implement 
// a Singly Linked List 
public class SinglyLinkedList { 
  
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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.isEmpty())
        {
            head = new_node;
            list.addFirst(new_node);
        }
        
        // Else traverse till the last node 
        // and insert the new_node there 
        else
        {
            Node last = head;
            while(last.next != null)
            {
                last = last.next;
            }

            last.next = new_node;
            
        // Insert the new_node at last node 
            list.addLast(last);
        }
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node current_node = head;
        // Traverse through the LinkedList 
        while(current_node.next != null)
        {
            // Print the data at current node 
            System.out.println(current_node.data);
            // Go to next node 
            current_node = current_node.next;
        }
        System.out.println(current_node.data);
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