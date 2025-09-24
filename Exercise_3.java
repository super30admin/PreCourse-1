
// Time Complexity : isEmpty - O(1), push - O(1), pop - O(1), peek - O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : use of static methord was a bit confusing, generally if we have static methord it won't be able to read the object data of the class unless it is explicitly passed as done here. But for we have not used static methords so why the difference ? 
import java.io.*;

// Java program to implement 
// a Singly Linked List 
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
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        if (list.head == null) {
            System.out.print("List empty");
        } else {
            Node temp = list.head;
            // fixed the loop logic
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
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
        list = insert(list, 00);
        list = insert(list, 22);
        list = insert(list, 311);
        list = insert(list, 43);
        list = insert(list, 52);

        // Print the LinkedList
        printList(list);
    }
}