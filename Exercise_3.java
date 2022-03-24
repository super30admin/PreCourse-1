import java.io.*;


class LinkedList {

    Node head; // Starting node

    // class the has the node data and reference of the next node
    static class Node {

        int data;
        Node next;

        // Initialising the data and reference.
        Node(int d)
        {
            //Write your code here
            data = d;
            next = null;
        }
    }


    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node and initialize with the data passed
        Node node = new Node(data);

        node.next = null;

        // checking of the list is empty
        // then make the new node as head
        if(list.head == null){
            list.head = node ;
        }
        else {
            // Else traverse till the last node by using while next == null
            // and insert the new_node there
            Node n = list.head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }

        // Insert the new_node at last node and returns the list.

        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node node = list.head;
        // Traverse through the LinkedList like before
        while(node.next != null){
            // Prining the current node data
            System.out.println(node.data);
            // jumping to next node
            node = node.next;
        }
        System.out.println(node.data);




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