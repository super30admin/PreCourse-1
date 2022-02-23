// Time Complexity :  O(n)
// Space Complexity : O(1)

// Code 

import java.io.*;

// Java program to implement a Singly Linked List 
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
            data = d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node temp = new Node(data); // Creating a new node with given data
        temp.next = null;

        if (list.head == null) { // If the Linked List is empty, then make the new node as head
            list.head = temp;
        } else {
            Node ptr = list.head;
            while (ptr.next != null) { // Else traverse till the last node and insert the new_node there
                ptr = ptr.next;
            }
            ptr.next = temp; // Insert the new_node at last node
        }

        return list; // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node ptr = list.head;
        while(ptr != null){
            System.out.println(ptr.data);   // Print the data at current node
            ptr = ptr.next;   // Go to next node
        }

       
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