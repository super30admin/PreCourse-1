import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    private Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            //Write your code here
            this.data = d;
        }

    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.getHead() == null) {
            list.head = node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node traverseNode = list.getHead();
            while (traverseNode.next != null) {
                traverseNode = traverseNode.next;
            }
            // Insert the new_node at last node
            traverseNode.next = node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node startNode = list.getHead();

        while (startNode != null) {
            // Print the data at current node
            System.out.println("Data at current node" + startNode.data);

            // Go to next node
            startNode = startNode.next;
        }

    }

    Node getHead() {
        return this.head;
    }
}
