// Time Complexity :
// insert() - O(n), where n is the number of nodes in the list
//             because we traverse the entire list to insert at the end
// printList() - O(n), to print each node once

// Space Complexity : O(n) where n is the maximum size of the stack.

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
            data = d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node; // Set the head to the new node
        } else {
            // Else traverse till the last node
            Node last = list.head; // Start from head
            while (last.next != null) { // Traverse till the last node
                last = last.next; // Move to next node
            }
            // Insert the new_node at last node
            last.next = new_node; // Link the new node at the end
        }
        return list; // Return the list by head
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node currNode = list.head; // Start from head
        while (currNode != null) {
            System.out.print(currNode.data + " "); // Print the data at current node
            currNode = currNode.next; // Move to next node
        }
        System.out.println();
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