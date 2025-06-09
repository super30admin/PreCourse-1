// Time Complexity : O(1) for all operations
// Space Complexity : O(n) for number of elements in the stack
// Did this code successfully run on Leetcode : No suitable problem available
// Any problem you faced while coding this : Yes, had to change public class to class due to OOP concepts

import java.io.*; 
  
// Java program to implement a Singly Linked List 
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
        if (list.head == null) {
            list.head = new_node;
        }
        // Else traverse till the last node and insert the new_node there 
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node 
            last.next = new_node;
        }
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node currNode = list.head;
        while (currNode != null) {
            // Print the data at current node 
            System.out.print(currNode.data + " ");
            // Go to next node 
            currNode = currNode.next;
        }
        System.out.println();
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