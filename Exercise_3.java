import java.io.*;

// Java program to implement 
// a Singly Linked List 
class LinkedList {

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

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head
        if (list.head==null) {
            list.head = newNode;
        } else {
            Node temp = list.head;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {
        while (list.head!=null) {
            System.out.println("[" + list.head.data + "] ");
            list.head = list.head.next;
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