import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    private Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    private static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            // Write your code here
            this.data = d;
        }
    }

    /**
     * TC: O(n) <br>
     * SC: O(1)
     * 
     * @param list
     * @param data
     * @return
     */
    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node tail = getTail(list);
            // Insert the new_node at last node
            tail.next = node;
        }

        // Return the list by head
        return list;
    }

    /**
     * Get the tail of the LL <br>
     * TC: O(n) <br>
     * SC: O(1)
     * 
     * @param list
     * @return
     */
    private static Node getTail(LinkedList list) {
        Node curr = list.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }

    /**
     * TC: O(n) <br>
     * SC: O(1)
     * 
     * @param list
     */
    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node curr = list.head;
        // Traverse through the LinkedList
        while (curr != null) {
            // Print the data at current node
            System.out.println(curr.data);
            // Go to next node
            curr = curr.next;
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