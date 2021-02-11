package preCourse1;

public class ImplementSinglyLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static ImplementSinglyLinkedList insert(ImplementSinglyLinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return list;
    }

    public static void printList(ImplementSinglyLinkedList list) {
        Node temp = list.head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        ImplementSinglyLinkedList list = new ImplementSinglyLinkedList();

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
