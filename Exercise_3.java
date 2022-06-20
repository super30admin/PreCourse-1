import java.io.*;

// Time Complexity :: O(1)
// Space Complexity :: O(1) :: As we are not using any extra space for performing ops

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
            //Write your code here
            this.data = d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node nn = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = nn;
        } else {
            Node temp = head;

            while (temp.next != null) temp = temp.next;

            // At this point we are at last node
            temp.next = nn;
        }

        return list;
        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList

        Node root = list.head;

        while (root != null) {
            System.out.println(root.data);
            root = root.next;
        }

        // Print the data at current node

        // Go to next node
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