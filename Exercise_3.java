import java.io.*;

// Java program to implement 
// a Singly Linked List

/**
 * Author: Amish Papneja
 * Time Complexity: Insert and Print Operation: O(n) where n is the current number of elements in the linked list.
 * Space Complexity: O(n)
 * Leetcode run: NA
 * Problems faced: None
 */
class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;

        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        Node walker = list.head;
        if (list.head == null) {
            list.head = new Node(data);
            return list;
        }
        while (walker.next != null) {
            walker = walker.next;
        }
        walker.next = newNode;
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node walker = list.head;
        while (walker != null) {
            System.out.print(walker.data + " -> ");
            walker = walker.next;
        }
        System.out.print("null");

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