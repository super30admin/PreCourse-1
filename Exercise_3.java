import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    static Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            this.data = d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node objNode = new Node(data);

        if (head == null) {
            list.head = objNode;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = objNode;
        }
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node temp = list.head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    // Driver code
    public static void main(String[] args) {
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