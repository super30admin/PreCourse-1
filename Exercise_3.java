import java.io.*;

// Java program to implement
// a Singly Linked List

// Time complexity: O(n)
// Space complexity: O(n)
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
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node temp = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null) {
            list.head = temp;
        }
        else {
            Node tmp = list.head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = temp;
        }
        return list;

            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node print = list.head;
        while (print != null) {
            System.out.println(print.data);
            print = print.next;
        }

            // Print the data at current node

            // Go to next node
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list.*/
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