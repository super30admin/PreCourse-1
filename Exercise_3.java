// Exercise_3 : Implement Singly Linked List.

// Time Complexity : O(N) afor insert and print
// Space Complexity : O(N) as we need a N objects of Node class connected with each other
// Did this code successfully run on Leetcode : Could not find it on leetcode. But ran successfully locally
// Any problem you faced while coding this : Miswrote on line 50 - Insert New node at end. Also, getting confused in picturing curr and curr.next when using while loops

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class Exercise_3 { 
  
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
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node n = new Node(data);
        n.next = null;
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if( list.head == null)
            list.head = n;
        
            // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node curr = list.head;
            while(curr.next != null)
                curr = curr.next;
            // Insert the new_node at last node 
            curr.next = n;
        }

        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        Node curr = list.head;
        // Traverse through the LinkedList 
        while(curr != null)
        {
            // Print the data at current node 
            System.out.println(curr.data);
            // Go to next node 
            curr = curr.next;
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3(); 
  
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