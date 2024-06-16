/*
1. Time Complexity :  All operations (insert, printList, find, remove) - O(n)
2. Space Complexity : O(n)
3. Did this code successfully run on Leetcode : Solved Problem - 707. Design Linked List
4. Any problem you faced while coding this : -
 */

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
        Node(int d) { 
          this.data = d;
          this.next = null;  
        } 
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) 
    {
        Node n = new Node(data);
        if (list.head == null) {
            list.head = n;
        } else {
            Node current = list.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }

    public static Node find(LinkedList list, int data) {
        Node current = list.head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public static boolean remove(LinkedList list, int data) {
        Node current = list.head;
        Node previous = null;
        while (current != null) {
            if (current.data == data) {
                if (previous == null)
                    list.head = list.head.next;
                else {
                    previous.next = current.next;
                    current.next = null;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
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