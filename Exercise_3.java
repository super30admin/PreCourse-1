/**
 * Time Complexity for inserting a new node at the beginning: O(1)
 * Time Complexity for inserting a new node at the end: O(N)
 * Space Complexity: O(1)
 * */ 
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
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data) {
        // Create a new node with given data
        Node node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = node;
        }

        // Else traverse till the last node
        // and insert the new_node there

        else {
            Node current = list.head;

            while (current.next != null) {
                current = current.next;
            }

            // Insert the new_node at last node
            current.next = node;

        }

        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {
        Node current = list.head;
        // Traverse through the LinkedList
        while (current != null) {
            // Print the data at current node
            System.out.println(current.data + " ");

            // Go to next node
            current = current.next;
        }

    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3();

        // Print the LinkedList
        System.out.println("Before inserting");
        printList(list);
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
        System.out.println("After inserting");
        printList(list);
    }
}