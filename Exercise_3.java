import java.io.*;

// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    static Node head; // head of list

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
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            newNode.data = data;
            newNode.next = head;
            head = newNode;
        }
        // Else traverse till the last node
        // and insert the new_node there
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Node newNode = new Node(data);
            newNode.data = data;
            current.next = newNode;
        }
        // Insert the new_node at last node
        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {

        // Traverse through the LinkedList
        // Print the data at current node
        // Go to next node
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
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