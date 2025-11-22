//Time Complexity:O(n)
//Space: O(n)
//On terminal it runs successfully
//Problems Faced: Understanding pointers
import java.io.*;

// Java program to implement
// a Singly Linked List
public class Exercise_3 {

    Node head; // head of list

    // Linked list Node.
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);

        // If list is empty
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        return list;  // <-- FIXED
    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list)
    {
        Node current = list.head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    // Driver code
    public static void main(String[] args)
    {
        Exercise_3 list = new Exercise_3();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        printList(list);
    }
}

