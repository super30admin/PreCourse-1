// Time Complexity : O(n) for insert and print functions
// Space Complexity : O(n) for storing the list, head is constant space pointer

// Explanation:
// Head is of Node type which marks the head of the Linked List.
// Head is initialized. 
// Insert: The Node node is initialized with input data. If head == null, list is empty, head = node. Else list is traversed till the last node and the input node is inserted at the end.
// PrintList: If head is null, list is empty. Else list is traversed till the end by taking Node current and inside every loop current = current.next until current.next != null and logging out the current.data. 

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
        Node node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = node;
            return list;
        }
        // Else traverse till the last node
        // and insert the new_node there
        // Insert the new_node at last node
        Node current = list.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {
        // Traverse through the LinkedList

        if (list.head == null) {
            System.out.println("List is empty");
        }

        Node current = list.head;
        while (current != null) {
            // Print the data at current node
            System.out.print(current.data + " ");
            // Go to next node
            current = current.next;
        }
    }

    // Driver code
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