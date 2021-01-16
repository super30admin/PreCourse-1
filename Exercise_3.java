
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

            data = d;
            next = null;
        }
    }

    // O(n) S:O(n)
    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        }

        // Else traverse till the last node
        // and insert the new_node there

        else {
            Node start = list.head;
            while (start.next != null) {
                start = start.next;
            }
            start.next = newNode;
        }

        // Insert the new_node at last node
        // Return the list by head

        return list;

    }

    // O(n) S:O(1)
    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node start = list.head;

        if (start == null) {
            return;
        }

        // Print the data at current node
        else {
            System.out.println(start.data);
            while (start.next != null) {
                start = start.next;
                System.out.println(start.data);
            }
        }
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