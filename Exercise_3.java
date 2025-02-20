import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    Node head = null; // head of list
    Node current = null;

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
    public static LinkedList insert(LinkedList list, int data)
    {

        if (list.head == null) {
            Node newNode = new Node(data);
            list.head = newNode;
            list.current = list.head;
        } else {
            Node newNode = new Node(data);
            list.current.next = newNode;
            list.current = list.current.next;

        }
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList 

        // Print the data at current node

        // Go to next node

        list.current = list.head;
        while (list.current != null) {
            System.out.println(list.current.data);
            list.current = list.current.next;
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
        list = insert(list, 10);
        list = insert(list, 21);
        list = insert(list, 31);
        list = insert(list, 44);
        list = insert(list, 58);


        // Print the LinkedList 
        printList(list);
    }
}
