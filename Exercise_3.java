// Time Complexity : O(n) as it has to traverse through the complete linked list for inserting and printing
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this:  Had to go through study materials online for correcting the syntax 
// Your code here along with comments explaining your approach: For insertion, a new node is added after the last node: For Inserting, first, we check if the LinkedList is empty and if it is, then we add the new node to the head of the list, or else we traverse till the last node and add it to the last node. For printing, we traverse through the complete linked list and print the data in the current node.

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
            //Write your code here
            this.data=d;
            this.next=null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {

        // Create a new node with given data
        Node newNode=new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head==null)
        {

            list.head=newNode;
            return list;

        }

        // Else traverse till the last node
        // and insert the new_node there
        else
        {
            Node lastNode=list.head;

            while(lastNode.next!=null)
            {
                lastNode=lastNode.next;
            }
            // Insert the new_node at last node

            lastNode.next=newNode;

        }

        // Return the list by head

        return list;


    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node currentNode=list.head;

        while (currentNode!=null)
        {
            // Print the data at current node
            System.out.println(currentNode.data);
            // Go to next node
            currentNode=currentNode.next;
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