// Time Complexity :
// insert(): O(n)
// printList() O(n)

// Space Complexity :
// insert(): O(1)
// printList() O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// This code is implements a singly linked list with following operations
// insert(): Add a new node at the end of the linked list
// print(): Prints all the elements of the linked list
//Apporach:
//Define a node class with data and next pointer
//The Linked list class provide a insert method to add a new node at the end of the list
// The print method to triverse the head to end of the list and print the each node data
//The main method tests the linked list by inserting value and printing the list



import java.io.*;

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
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node at the end of the linked list
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null) {
            list.head = newNode;
        } else{
            // Else traverse till the last node
            // and insert the new_node there
            Node current = list.head;
            while(current.next!=null) {
                current = current.next;
            }
            // Insert the new_node at last node
            current.next = newNode;
        }
        // Return the list by head
        return  list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node current = list.head;
        while(current != null) {
            // Print the data at current node
            System.out.println(current.data);
            // Go to next node
            current = current.next;
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