// Time Complexity :
/*  insert: O(n)
     */

// Space Complexity : O(n) where n = number of nodes

// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: added comments inline

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
        Node(int d) {
            // Write your code here
            data = d;
            next = null;

        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node node = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head

        // check the head of the list, if it is null, then we can add new node as head.
        if (list.head == null) {
            list.head = node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there

            // head should be at the start, so create a temporary node which we will use to
            // traverse through the linkedlist
            Node current = list.head;
            // run the while loop till we reach the end node and then add the new node to
            // the end
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        // Insert the new_node at last node
        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node current = list.head;
        // Traverse through the LinkedList
        while (current != null) {
            // traverse through all hte nodes and print them
            System.out.println(current.data + "->");
            current = current.next;
        }
        // Print the data at current node
        // Go to next node
    }

    // Driver code
    public static void main(String[] args) {
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