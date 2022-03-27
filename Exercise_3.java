import java.io.*;
//Time Complexity:O(N) for inserting and printing because traversing the whole linked list
// to add element at the end
//Space Complexity: O(N) traversing the whole list

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
        Node(int d)
        {
            //Write your code here
            data = d;
            next = null;
        }
    }
    LinkedList(){
        head = null;
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
        // Return the list by head


        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
            return list;

        }

        Node prevNode = list.head;

        while(prevNode.next != null){
            prevNode = prevNode.next;
        }

        prevNode.next = newNode;
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList

            // Print the data at current node

            // Go to next node
        Node dummy = list.head;

        while(dummy != null){
            System.out.print(dummy.data+"->");
            dummy = dummy.next;
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