/*
 Time Complexity :
 1. insert operation: O(1)
 2. printList: O(N)
 */

/*
 Space Complexity: Space complexity for all the operations will be O(1)
 */

// Did this code successfully run on Leetcode :N/A
// Any problem you faced while coding this : I updated the LinkedList class as class instead of Public class to make it run

/*
    Linked List implementation,
    1. Inserting element at the end of the given LinkedList list
    2. Creating a new node and setting its data to the inserting data value and next pointer to null
 */

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
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
        newNode.next = null;
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = newNode;
        }
        else{
            // Else traverse till the last node
            // and insert the new_node there
            Node endNode = list.head;
            while(endNode.next!= null){
                endNode = endNode.next;
            }
            // Insert the new_node at last node
            endNode.next = newNode;
        }
        // Return the list by head
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {
        Node saveNode = list.head;
        // Traverse through the LinkedList 
        while(saveNode!= null){
            // Print the data at current node
            System.out.println("Linked List data: "+ saveNode.data);
            // Go to next node
            saveNode = saveNode.next;
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