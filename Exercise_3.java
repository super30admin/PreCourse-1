// Time Complexity: O(N) for all operations
// Space Complexity: O(N)
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
// Explained in comments


import java.io.*;

// Java program to implement 
// a Singly Linked List 
class LinkedList {

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
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node tempNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list == null) {
            LinkedList ll = new LinkedList();
            ll.head = tempNode;
            return ll;
        }

        if (list.head == null) {
            list.head = tempNode;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node itr = list.head;
            while (itr.next != null)
                itr = itr.next;

            // Insert the new_node at last node
            itr.next = tempNode;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        if (list == null || list.head == null)
            return;
        // Traverse through the LinkedList
        Node itr = list.head;
        while (itr != null) {
            // Print the data at current node
            System.out.println(itr.data);
            // Go to next node
            itr = itr.next;
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