
/* Time Complexity :  As we are inserting element in the LinkedList it will take Big O(1) to insert in the LinkedList
 and printlist function print n element in th list so total time complexity is Big O(n).

 Space complexity :  O(n)
 */
import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class Exercise_3 {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;

        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data) {

        // Create a new node with given data

        Node newNode = new Node(data);
        newNode.next = null;

        // If the Linked List is empty,
        // then make the new node as head

        if (list.head == null) {

            list.head = newNode;
        }

        // Else traverse till the last node
        // and insert the new_node there
        else {

            // Insert the new_node at last node

            Node prev = list.head;
            while (prev.next != null) {
                prev = prev.next;
            }
            prev.next = newNode;

        }

        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {
        // Traverse through the LinkedList

        Node currNode = list.head;

        // Print the data at current node

        // Go to next node

        while (currNode != null) {
            System.out.println(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    // D

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

        // Print the LinkedList
        printList(list);
    }
}