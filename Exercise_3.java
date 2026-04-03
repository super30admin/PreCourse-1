import java.io.*;

// Java program to implement
// a Singly Linked List
class LinkedList {
    // Time Complexity: o(1) // Reduce from o(N) to o(1) by introducing tail
    // Space Complexity: o(N) where N being size of the data;
    Node head; // head of list
    Node tail; // Tail of the list to improve insertion

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

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
            // first node is both head and tail
            list.tail = newNode;
        } else {
            // link to end
            list.tail.next = newNode;
            // advance tail
            list.tail = newNode;
        }
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node currNode = list.head;
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + "->");
            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("Done!");
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