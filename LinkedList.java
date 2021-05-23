import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedList {

    static Node head;

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            this.data=d;
            next=null;
        }
    }

    // Method to insert a new node
    public LinkedList insert(LinkedList list,int data)
    {
        Node first = new Node(data);
        Node n = head;
        if(head==null)
        {
            head = first;
        }
        else {
            n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = first;
        }
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node temp = list.head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
        // Traverse through the LinkedList

            // Print the data at current node

            // Go to next node
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
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}