import java.io.*;

/*
Time complexity:
Space Complexity:
Did this code successfully run on Leetcode:
Any problem you faced while coding this:

Code along with comments explaining my approach is as follows
*/

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
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {

        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
            return list;
        } else {
            // Else traverse till the last node
            Node pointer = list.head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            // and insert the new_node there
            // Insert the new_node at last node
            pointer.next = new_node;
            // Return the list by head
            return list;
        }
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node temp = list.head;
        System.out.print(temp.data + " -> ");
        while (temp.next != null) {
            temp = temp.next; // Go to next node
            System.out.print(temp.data + " -> "); // Print the data at current node
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

        printList(list);

    }
}
