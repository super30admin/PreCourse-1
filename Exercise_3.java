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
            //Write your code here 
        }
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data 

        // If the Linked List is empty, 
        // then make the new node as head
        Node currNode = new Node(data);
        currNode.next = null;
        if (list.head == null) {
            list.head = currNode;
        }


        // Else traverse till the last node
        // and insert the new_node there
        else {
            while (list.head.next != null) {
                list.head = list.head.next;
            }
            // Insert the new_node at last node
            list.head.next = currNode;
        }


        // Return the list by head 
        return list;
    }



    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList 
        while (list.head.next != null) {
            // Print the data at current node

            list.head = list.head.next;
            System.out.println("" + list.head.data);
        }

        System.out.println(" " + list.head.data);
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