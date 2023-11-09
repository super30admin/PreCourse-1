import java.io.*;
import javax.swing.text.rtf.RTFEditorKit;
import javax.naming.NameAlreadyBoundException;
import javax.swing.RootPaneContainer;
import javax.swing.text.rtf.RTFEditorKit;

// Java program to implement 
// a Singly Linked List 
public class Exercise_3 {

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
            this.next = null;
        }

    }

    // Method to insert a new node
    // TC O(N) SC O(N)
    public static Exercise_3 insert(Exercise_3 list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
            return list;
        }
        Node curr = list.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return list;
    }

    // Method to print the Exercise_3.
    // TC O(N) SC O(1)
    public static void printList(Exercise_3 list) {
        Node curr = list.head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the Exercise_3
        printList(list);
    }
}