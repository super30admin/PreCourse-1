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
            this.data = d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        Node newNode = new Node(data);

        if(isEmpty(list)){
            list.head = newNode;
            System.out.println("insert: "+ list.head.data);
        }
        else{
            Node pointer = list.head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = newNode;
            System.out.println("insert: "+ pointer.data);

        }
        return list;

    }

    private static boolean isEmpty(LinkedList list) {

        return (list.head == null);
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node pointer = list.head;
        while(pointer != null){
            System.out.println("data: "+ pointer.data);
            pointer = pointer.next;
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