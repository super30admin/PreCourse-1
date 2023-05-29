// Time Complexity : O(n) (since you need to traverse through the entire list to insert)
// Space Complexity : O(n) [Since we have ]
// Did this code successfully run on Leetcode : No. Ran it on my local machine.
// Any problem you faced while coding this : No 


import java.io.*;
import java.security.acl.LastOwnerException; 
  
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
            this.data = d;
            this.next = null;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
          Node n = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null){
            list.head = n;
        }
        else{
        
            // Else traverse till the last node 
            // and insert the new_node there 

            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }
            // Insert the new_node at last node 
           last.next = n;
        }
            
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node currNode = list.head;
     
        // Traverse through the LinkedList 
        while(currNode!= null) {
             // Print the data at current node 
            System.out.println(currNode.data + " ");
              // Go to next node 
            currNode = currNode.next;
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