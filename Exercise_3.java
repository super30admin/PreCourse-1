import java.io.*; 

// Java program to implement a Singly Linked List 
public class LinkedList { 

    Node head; // head of list 

    // Linked list Node.
    // This inner class is made static so that main() can access it 
    static class Node { 
        int data; // Data part of the node
        Node next; // Pointer to the next node

        // Constructor to initialize a node
        Node(int d) { 
            data = d; // Assign data to the node
            next = null; // Initialize next as null
        } 
    } 

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) { 
        // Create a new node with given data
        Node newNode = new Node(data); 

        // If the Linked List is empty, then make the new node as head
        if (list.head == null) { 
            list.head = newNode; 
        } else { 
            // Else traverse till the last node and insert the new node there
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            // Insert the new node at the last node
            last.next = newNode; 
        } 
        // Return the list by head
        return list; 
    } 

    // Method to print the LinkedList
    public static void printList(LinkedList list) { 
        Node currNode = list.head; // Start from the head node

        // Traverse through the LinkedList
        while (currNode != null) { 
            // Print the data at current node
            System.out.print(currNode.data + " "); 

            // Go to the next node
            currNode = currNode.next; 
        } 
    } 

    // Driver code
    public static void main(String[] args) { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 

        // ******INSERTION****** 

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