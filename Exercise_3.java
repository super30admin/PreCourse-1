// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode:
// Any problem you faced while coding this: Yes, for implementation purpose took ref from the internet

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
            // Write your code here
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node nNode = new Node(data);

        // Check if linkedList is empty then make nNode as head
        nNode.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = nNode;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nNode;
        }
        // Insert the new_node at last node
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node temp = list.head;
        // Traverse through the LinkedList
        while (temp != null) {
            // Print the data at current node
            System.out.print(temp.data + " -> ");
            // Go to next node
            temp = temp.next;
        }
        System.out.println("END");
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