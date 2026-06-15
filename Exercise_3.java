//Time Complexity : O(n)
//Space Complexity : O(n)

import java.io.*;
import java.util.LinkedList;

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
            this.data = d;
            this.next = null; // to store data
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // traverse till the last node
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // insert at last
        }
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {
        Node temp = list.head;
        // Traverse through the LinkedList
        while (temp != null) {
            System.out.println(temp.data + "");
            temp = temp.next;
        }

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