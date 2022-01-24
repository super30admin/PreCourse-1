// Operation:          insert  printList
// Time Complexity:      n         n
// Space Complexity:     1         1
// Yes, this code ran successfully
// No, I didn't face any problem in this problem

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
        Node(int d) {
            //Write your code here
            this.data = d;                              // Initializing Node
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

        Node node = new Node(data) ;                    // creating node with data
        Node cur = list.head ;

        if(list.head == null)                           // LinkedList is Empty
            list.head = node ;
        else                                            // LinkedList is not Empty
        {
            while(cur.next != null)
                cur = cur.next ;
            cur.next = node ;
        }
        return list ;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList

        // Print the data at current node

        // Go to next node

        Node cur = list.head;                           // setting new pointer "cur" to head
        System.out.println("Printing Linked List:");
        while (cur.next != null)                        // traversing
        {
            System.out.println(cur.data);
            cur = cur.next ;
        }
        System.out.println(cur.data);                   // printing last remained element
    }
}

public class Exercise_3
{
    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
        list = LinkedList.insert(list, 5);

        // Print the LinkedList
        LinkedList.printList(list);
    }
}