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
            data = d;
            next = null;
        }
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at the last node
            last.next = newNode;
        }

        return list;

    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        Node curNode = list.head;

        // Traverse through the LinkedList
        while (curNode != null) {
            // Print the data at current node
            System.out.print(curNode.data + " ");

            // Go to the next node
            curNode = curNode.next;
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