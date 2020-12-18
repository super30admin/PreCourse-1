// Time Complexity : O(n) where n is size of list
// Space Complexity : O(n) where n is size of list
// Did this code successfully run on Leetcode : Did not find it in leetcode
// Any problem you faced while coding this :
// File name was not same as class name but class was made public. This resulted in error.


// Your code here along with comments explaining your approach
// add the new node at head if head is null else traverse the list and add at the end.
// It can be done in O(1) if we use one tail variable to track last element

import java.io.*;
  
// Java program to implement 
// a Singly Linked List 
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
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node node = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null) list.head = node;
            // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node currNode = list.head;
            while(currNode.next != null) currNode = currNode.next;
            currNode.next = node;
        }
            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node currNode = list.head;
        while(currNode != null){
            System.out.println("data : " + currNode.data);
            currNode = currNode.next;
        }
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