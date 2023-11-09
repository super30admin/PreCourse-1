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
            // Write your code here
            data = d;
            next = null;
        }
    }

    // Time Complexity :O(n)
    // Space Complexity :O(1)
    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node node = new Node(data);
        node.next = null;
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = node;
            return list;
        }
        // Else traverse till the last node
        // and insert the new_node there
        Node last = list.head;
        while (last.next != null) {
            last = last.next;
        }
        // Insert the new_node at last node
        // Return the list by head
        last.next = node;
        return list;

    }

    // Time Complexity :O(n)
    // Space Complexity :O(1)
    // Method to delete a valuse from the list
    public static LinkedList delete(LinkedList list, int data) {
        if (list.head == null) {
            System.out.println("List is empty");
            return list;
        }
        if (list.head.next == null) {
            if (list.head.data == data) {
                list.head = null;
                System.out.println("removed " + data + ", not List is empty");
                return new LinkedList();
            }
            return list;
        }
        Node current = list.head;
        Node previous = null;
        while (current.next != null) {
            if (current.data == data) {
                previous.next = current.next;
                break;
            } else {
                previous = current;
                current = current.next;
            }
        }
        return list;
    }

    // Time Complexity :O(n)
    // Space Complexity :O(1)
    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        if (list.head == null) {
            System.out.println("List is empty");
            return;
        }
        Node last = list.head;
        while (last.next != null) {
            System.out.println(last.data);
            last = last.next;
        }
        // Print the data at current node

        // Go to next node
    }

    // Driver code
    public static void main(String[] args) {

        /* Start with the empty list. */
        LinkedList list = new LinkedList();
        printList(list);
        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = delete(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = delete(list, 3);
        // Print the LinkedList
        printList(list);
    }
}