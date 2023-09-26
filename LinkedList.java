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
        Node(int d)
        {
            // Initialize the data and set the next node to null
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node at the end of the linked list
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with the given data
        Node newNode = new Node(data);

        // If the Linked List is empty, make the new node as the head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else, traverse to the last node and insert the new node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        // Return the updated list
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currentNode = list.head;

        // Traverse through the LinkedList and print the data at each node
        while (currentNode != null) {
            System.out.print(currentNode.data + " - ");
            currentNode = currentNode.next;
        }

        // Print "null" to indicate the end of the list
        System.out.println("null");
    }

    // Driver code
    public static void main(String[] args)
    {
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
