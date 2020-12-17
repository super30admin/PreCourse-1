import java.io.*;

/*
singly linked list:
time complexity :
insert operation : O(n), where n is the number of nodes in list as we need to traverse the list from root.

 */
// Java program to implement
// a Singly Linked List
 class LinkedList {

    Node head; // head of list
    Node tail;

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
        }
    }

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
        Node node;
        if (list.head == null){
            list.head = new Node(data);
            return list;
        }
        Node curr = list.head;
        Node prev = list.head;
        while (curr  != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = new Node(data);
        return list;


    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList

            // Print the data at current node

            // Go to next node
        if (list == null){
            System.out.println("insert elements into the linked list");
        }
        Node curr = list.head;
        while (curr.next  != null){
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.print(curr.data);
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