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
        Node(int d)
        {
            //Write your code here
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);


        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
           list.head = newNode;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node tempNode = list.head;
            while (tempNode.next != null)
            {
                tempNode = tempNode.next;
            }
            tempNode.next = new Node(data);
        }
        // Insert the new_node at last node
        // Return the list by head
        return list; //Question ----------> What do you mean by list by head ?

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        if (list.head == null)
        {
            System.out.println(" Empty List");
        }
        else{
            Node tempNode = list.head;
           while(tempNode.next != null){
               System.out.print( tempNode.data +"->" );
               tempNode = tempNode.next;
           }
            System.out.print(tempNode.data);
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