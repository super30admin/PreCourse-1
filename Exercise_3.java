import java.io.*;

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
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node node = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            System.out.println("node1 " + node.data);
            head = node;
            list.head = node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
                System.out.println("node2 " + current.data);
            }
            // Insert the new_node at last node
            // Return the list by head
            current.next = node;
        }

        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node current = list.head;
        while (current.next != null) {
            // Print the data at current node
            System.out.println("Node data " + current.data);
            // Go to next node
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