import java.io.*;
/*
Time Complexity : O(N) To add a new element we need to traverse all the elements in the list
Space Complexity : O(1) No additional space used.
Did this code successfully run on Leetcode : Ran on editor
Any problem you faced while coding this : No
 */

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
        Node(int d)
        {
            //Write your code here
           data = d;
           next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(0);
        newNode.data = data;
        newNode.next = null;
        // If the Linked List is empty,
        if (list.head == null) {
            // then make the new node as head
            list.head = newNode;
        } else {
            // Else traverse till the last node
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            // and insert the new_node there
            // Insert the new_node at last node
            temp.next = newNode;
        }
        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node temp = list.head;

        while(temp != null) {
            // Print the data at current node
            System.out.println("Value: " + temp.data);
            // Go to next node
            temp = temp.next;
        }
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