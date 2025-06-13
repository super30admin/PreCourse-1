
// Time Complexity : O(n) for insert, delete, search, print
// Space Complexity : O(n) for n nodes
import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class Exercise_3 {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    private static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else, traverse to the end and append the new node
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {
        // Traverse through the LinkedList
        Node temp = list.head;
        while (temp != null) {
            System.out.println("Data at current node: " + temp.data);
            temp = temp.next;
        }
    }

    // Method to search for a given key
    public static boolean search(Exercise_3 list, int key) {
        Node temp = list.head;
        while (temp != null) {
            if (temp.data == key)
                return true; // key found
            temp = temp.next;
        }
        return false;// key not found
    }

    // Method to delete a node by key
    public static Exercise_3 delete(Exercise_3 list, int key) {
        Node temp = list.head;
        Node prev = null;
        // If head node holds the key
        if (temp != null && temp.data == key) {
            list.head = temp.next;
            return list;
        }
        // search for the key in the list
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        // key found, deleting
        if (temp != null) {
            prev.next = temp.next;
        } else {
            // key not found
            System.out.println("key" + key + " not found in list");
        }
        return list;
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        System.out.println("\nSearching for 3: " + (search(list, 3) ? "Found" : "Not Found"));
        System.out.println("Searching for 9: " + (search(list, 9) ? "Found" : "Not Found"));

        System.out.println("\nDeleting 3...");
        list = delete(list, 3);
        // Print the LinkedList
        printList(list);
    }
}