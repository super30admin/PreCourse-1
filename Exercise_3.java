//Time Complexity: O(1) for insertion, O(n) for printing, where n is size of linkedlist
//SpaceComplexity: O(n) overall, where n is size of linkedlist

import java.io.*;

// Java program to implement 
// a Singly Linked List 
class LinkedList {

    Node head; // head of list
    Node top;

    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node node = new Node(data);
        if (null == list.head) {
            list.head = node;
            list.top = node;
        }
        if (list.head == list.top) {
            list.head.next = node;
        }
        list.top.next = node;
        list.top = node;

        return list;
    }

    public static void printList(LinkedList list) {
        if (null == list.head) {
            return;
        }
        Node n = list.head;
        while (null != n) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    // Driver code 
    public static void main(String[] args) {
        //Start with the empty list.

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