import java.io.*;

// Java program to implement 
// a Singly Linked List 
class LinkedList {

    Node head; // head of list
    // Node tail;
    int size;

    public LinkedList() {
        this.size = 0;
    }

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Method to insert a new node
    // TC : O(N)
    // SC : O(1)
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node node = new Node(data);
        // If the Linked List is empty,
        if (list.size == 0) {
            // then make the new node as head
            list.head = node;
            list.size++;
            return list;
        }
        Node temp = list.head;
        // Else traverse till the last node
        for (int i = 1; i < list.size; i++) {
            temp = temp.next;
        }
        // and insert the new_node there
        temp.next = node;
        list.size++;
        // Insert the new_node at last node
        // Return the list by head
        return list;

    }

    // TC : O(N)
    // SC : O(1)
    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node temp = list.head;
        for (int i = 0; i < list.size; i++) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        // Traverse through the LinkedList

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