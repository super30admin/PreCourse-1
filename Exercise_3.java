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
        Node(int d,Node next)
        {
            this.data = d;
            this.next = next;

            //Write your code here
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {

        Node insertNode = new Node(data,null);
        // Create a new node with given data
        if(list.head == null){
            list.head = insertNode;
        }
        // If the Linked List is empty,
        // then make the new node as head
        else{
            Node tempNode = list.head;

            while(tempNode.next != null){
                tempNode = tempNode.next;
            }
            tempNode.next = insertNode;
        }
            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {

        Node tempNode = list.head;

        while(tempNode != null){
            System.out.println(tempNode.data);
            tempNode = tempNode.next;

        }
        // Traverse through the LinkedList

            // Print the data at current node

            // Go to next node
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