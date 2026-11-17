/*
Time Complexity :
creating a node - O(1)
inseting a data into empty list - O(1)
insertting at end - O(n)
Printing a linked list- O(n)

Space Complexity :
creating a node - O(1)
inseting a data into empty list - O(1)
insertting at end - O(1)
Printing a linked list- O(1)
*/


import java.io.*;

class LinkedList {

    Node head;

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

        // Create a new node
        Node newNode = new Node(data);

        // If list is empty, make new node the head
        if (list.head == null) {
            list.head = newNode;
        } else {

            // Start from head
            Node current = list.head;

            // Traverse until the last node
            while (current.next != null) {
                current = current.next;
            }

            // Insert new node at the end
            current.next = newNode;
        }

        return list;
    }

    // Method to print the LinkedList
    public static void printList(LinkedList list) {

        Node current = list.head;

        // Traverse through the LinkedList
        while (current != null) {

            // Print current node data
            System.out.print(current.data + " ");

            // Move to next node
            current = current.next;
        }
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        printList(list);
    }
}
