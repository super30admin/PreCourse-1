import java.io.*;

// Java program to implement
// a Singly Linked List
class LinkedList {

    Node head = new Node(-1, null); // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d, Node n)
        {
            //Write your code here
            this.data = d;
            this.next = n;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data, null);
        // If the Linked List is empty,
        // then make the new node as head
        if(list.head.data == -1){
            list.head.data = data;
            return list;
        }
            // Else traverse till the last node
            // and insert the new_node there
        Node temp = list.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
            // Insert the new_node at last node
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node temp = list.head;
        // Traverse through the LinkedList
        while(temp != null) {
            // Print the data at current node
            System.out.print(temp.data);
            // Go to next node
            temp = temp.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
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