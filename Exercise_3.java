
//Exercise_3 : Implement Singly Linked List.
//tc: O(n) for insertion,print
//sc: O(n)

import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    Node head; // head of list
    int length;

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
        }
    }

    LinkedList() {
        head = new Node(-1);
        length = 0;
    }

    public static Node traverse(LinkedList list) {
        Node curr = list.head;
        while (curr != null && curr.next != null) {
            curr = curr.next;
        }
        return curr;
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head

        if (list.length == 0)
            list.head = newNode;
        else {
            Node temp = traverse(list); // Else traverse till the last node
            temp.next = newNode;// and insert the new_node there
        }
        list.length++;
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node curr = list.head;

        while (curr != null) {
            System.out.print(curr.data);// Print the data at current node
            curr = curr.next;// Go to next node
        }
        return;
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