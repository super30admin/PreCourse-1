import java.io.*;

// Time Complexity:
// insert()    -> O(n)
// printList() -> O(n)
//
// Space Complexity:
// O(n)

public class Exercise_3 {

    Node head; // head of list

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    // Method to print the LinkedList
    public static void printList(Exercise_3 list) {
        Node currNode = list.head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
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