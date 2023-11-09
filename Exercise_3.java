
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : couldn't find this problem
// Any problem you faced while coding this : had confusion in understanding the problem, we are passing LinkedList as parameter so it confused me
// This solution maybe wrong

// Your code here along with comments explaining your approach

import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {


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
            next=null;
        }
    }


    Node head; // head of list

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head
        Node curr=list.head;
        if(curr==null)
            curr=new Node(data);
        Else{
        Node temp=curr;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=new Node(data);
    }
        Return list;;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList

        // Print the data at current node

        // Go to next node
        Node curr=list.head;
        while(curr!=null){
            System.out.print(curr.data + “ ”);
        }
        System.out.println();
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
