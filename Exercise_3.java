// T.C. Insertion O(1) on head, O(N) elsewhere,   S.C O(1)
// T.C. Traversal O(N)
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

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
            return list;
        }
        // Else traverse till the last node
        // and insert the new_node there
        new_node.next = null;
        Node last = list.head;
        while (last.next != null) {
            last = last.next;
        }
        // Insert the new_node at last node
        // Return the list by head
        last.next = new_node;
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList
        Node trav = list.head;
        // Print the data at current node
        while (trav != null) {
            System.out.println(trav.data);
            trav = trav.next;
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