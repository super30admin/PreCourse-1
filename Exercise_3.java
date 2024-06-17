import java.io.*;

// Java program to implement
// a Singly Linked List

// Time Complexity : O(n)
// Space Complexity : O(1)
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
            data = d;
            next = null;
        }
    }



    // Method to insert a new node
public void insert(LinkedList list, int data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        // Return the updated LinkedList object
    }

    // Method to print the LinkedList.
  public void printList(LinkedList list)
    {
       Node current = head;
       while (current != null){
           System.out.println(current.data + " ");
           current = current.next;
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
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);

        // Print the LinkedList
       list.printList(list);
    }
}