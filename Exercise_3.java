// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
            data = d; // value
            next = null; // reference to next element in the linked list
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node n = new Node(data);
        n.next = null;
        // If the Linked List is empty, 
        // then make the new node as head
        if (list.head == null){
            list.head = n;
        } else {
            // traverse till the last element and reference the new element being inserted
            Node lastNode = list.head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = n;
        }

        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        Node lastNode = list.head;
        // Traverse through the LinkedList 
        while (lastNode.next != null){
            System.out.println(lastNode.data + " ");
            lastNode = lastNode.next;
        }
        System.out.println(lastNode.data);
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