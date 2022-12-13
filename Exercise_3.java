// Time Complexity : Insert operation O(n), Print operation O(n)
// Space Complexity :                                       O(1) // No Additional Space
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :            NO

// Java program to implement
// a Singly Linked List 
class LinkedList {

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
        }
    }

    Node head;
    int count;

    public static boolean isEmpty(LinkedList list) {
        return list.head == null;
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        Node node = new Node(data);
        if (isEmpty(list)) {
            list.head = node;
            return list;
        }
        Node temp = list.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 23);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 523);

        // Print the LinkedList
        printList(list);
    }


}