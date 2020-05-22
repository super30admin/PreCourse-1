// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No

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
        if (list.head == null) {
            list.head = newNode;
        }
        // Else traverse till the last node
        // and insert the new_node there
        else {
            Node tail = list.head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
        }
        // Insert the new_node at last node
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList 
        Node last = list.head;
        while (last != null) {
            // Print the data at current node
            System.out.println(last.data);
            // Go to next node
            last = last.next;
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