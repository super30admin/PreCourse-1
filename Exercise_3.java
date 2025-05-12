import java.io.*;
// Time Complexity: push, pop, peek, isEmpty: O(1)
// Space Complexity: O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Java program to implement 
// a Singly Linked List 
public class Exercise_3 {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Exercise_3 insert(Exercise_3 list, int data) {

        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        return list;
    }

    public static void printList(Exercise_3 list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        Exercise_3 list = new Exercise_3();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        printList(list);
    }
}
