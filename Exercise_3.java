package LinkedList;

import java.io.*;

// Java program to implement
// a Singly Linked List
public class ImplementLinkedList {

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
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static ImplementLinkedList insert(ImplementLinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null)
        {
            list.head = newNode;
            return list;
        }

        // Else traverse till the last node
        // and insert the new_node there
        Node curr = list.head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        // Insert the new_node at last node
        // Return the list by head
        curr.next = newNode;
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(ImplementLinkedList list)
    {
        Node curr = list.head;
        while(curr.next != null)
        {
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    // Driver codeImplementLinkedList
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        ImplementLinkedList list = new ImplementLinkedList();

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
