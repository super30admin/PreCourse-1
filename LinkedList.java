import java.io.*;

public class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {

            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {

        Node node = new Node(data);
        node.next = null;

        if (head == null) {
            head = node;
        }

        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;

        }
        return list;

    }

    public static void printList(LinkedList list) {
        Node n = head;
        while (n.next != null) {
            System.out.println("The node has data :" + n.data);
            n = n.next;

        }
        System.out.println("The node has data :" + n.data);
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