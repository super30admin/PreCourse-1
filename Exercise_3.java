import java.io.*;

// Java program to implement 
// a Singly Linked List // Time Complexity : O(1) - for adding and O(n) for printing all elements
// Space Complexity :  O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// Keeping the current node reference so I don't have to iterate every time when adding new element
class LinkedList {

    static Node head; // head of list
    static Node current;

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Method to insert a new node
    static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node node = new Node(data, null);

        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = node;
            current = node;
        }
        // instead of traversing the list, keeping the reference to current node so we
        // can add the new entry in O(1)
        else {
            current.next = node;
            current = node;
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
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
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