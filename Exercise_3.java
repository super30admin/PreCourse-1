// Time Complexity : O(n) for insertion and printing
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
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
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node node = new Node(data);

        if (list.head == null) { // If the Linked List is empty,
            list.head = node; // then make the new node as head
        } else {
            Node cur = list.head;
            while (cur.next != null) { // Else traverse till the last node
                cur = cur.next;
            }
            cur.next = node; // Insert the new_node at last node
        }
        return list; // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {

        Node cur = list.head;
        while (cur != null) { // Traverse through the LinkedList
            System.out.print(cur.data + " "); // Print the data at current node
            cur = cur.next; // Go to next node
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