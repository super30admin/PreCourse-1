// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) //time:O(n), space:O(1)
    { 
        Node new_node = new Node(data); //create a new node
        if(list.head == null) //checks if list empty. if yes, assigns new node as head
            list.head = new_node;
        else 
            {
                Node tail = list.head; //else creates a tail node and traverse through the list
                while(tail.next != null)
                    tail = tail.next;

                tail.next = new_node; //adds node at the end of the lisr
            }

        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) //time:O(n), space:O(1)
    {  
        Node current = list.head; 
        while(current != null) //current node traverses through the end of the list prints each value
            {
                System.out.println(current.data + " ");
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