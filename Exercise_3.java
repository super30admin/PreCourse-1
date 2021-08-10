import java.io.*;

// Java program to implement
// a Singly Linked List
class LinkedList
{

    Node head; // head of list

    static class Node
    {

        int data;

        Node next;

        // Constructor
        Node(int d)
        {
            this.data = d;
            //Write your code here
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        Node n = new Node(data);
        n.next = null;
        if (list.head == null)
        {
            list.head = n;
        }
        else
        {
            Node pointer = list.head;
            while (pointer.next != null)
            {
                pointer = pointer.next;
            }
            pointer.next = n;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node pointer = list.head;

        while (pointer!=null)
        {
            System.out.println("VALUE IS "+pointer.data);
            pointer = pointer.next;
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