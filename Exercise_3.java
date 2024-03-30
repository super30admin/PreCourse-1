import java.io.*;

// Java program to implement 
// a Singly Linked List 
//Time complexcity is O(1) for insert operation if list is empty(best case), and O(n) otherwise for insert (worst case) .
//Same applicable for display method.O(1) for best case and O(n) for worst case.
//Space complexity is also O(1) in best case scenario and O(n) in worst case scenario.
public class LinkedList {

    Node head; // head of list

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

    LinkedList() {
        this.head = null;
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node current = list.head;
            // Else traverse till the last node
            while (current.next != null) {
                current = current.next;
            }
            // and insert the new_node there
            // Insert the new_node at last node
            current.next = newNode;
        }
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node current = list.head;
        while (current != null) {
            // Print the data at current node
            System.out.println(current.data);
            // Go to next node
            current = current.next;
        }
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