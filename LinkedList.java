// Time Complexity : insert() -> O(1), printList() -> O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

import java.io.*;
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head;// head of list
    Node tail;//tail of list
  
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
            //Write your code here
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head
        // Else append the new node at the end and update tail
        if (list.head == null) {
            list.head = node;
            list.tail = node;
            return list;
        } else {
            list.tail.next = node;
            list.tail = node;
            return list;
        }

        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
//        assign head to a temp node
//        print data of each node until temp is null
        Node temp = list.head;
        while (temp!= null) {
            System.out.println(temp.data);
            temp = temp.next;
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