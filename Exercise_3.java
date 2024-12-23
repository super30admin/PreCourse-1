// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : No

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
        Node(int d) {
            // Write your code here
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        // Checking If the Linked List is empty
        if (list.head == null) {
            // If empty, make the new node as head
            list.head = newNode;
        } else {
            // Else traverse to the end of list and insert at end - hence O(n)
            Node curr = list.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.next = null;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {
        // Traverse through the LinkedList
        Node curr = list.head;
        while (curr.next != null) {
            // Print data of each node
            System.out.print(curr.data + "->");
            // Go to the next node
            curr = curr.next;
        }
        System.out.print(curr.data);
    }

    // Driver code
    public static void main(String[] args) {
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