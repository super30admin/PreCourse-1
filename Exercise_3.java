import java.io.*;

// Java program to implement a Singly Linked List
public class LinkedList {

    Node head; // Head of the list

    // Linked List Node
    // Made static so it can be accessed in static methods like main()
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node at the end
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty, set the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse to the last node and insert the new node
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = newNode;
        }

        // Return the list with updated head
        return list;
    }

    // Method to print the LinkedList
    public static void printList(LinkedList list) {
        Node currentNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the list and print data
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

        System.out.println(); // For new line after printing the list
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // ******INSERTION******
        // Insert values into the linked list
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}
