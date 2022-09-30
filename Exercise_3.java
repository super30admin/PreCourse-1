

// insert timeComplexity - O(n) // n is current size of the stack
// printList timeComplexity - O(n)
// Space complexity - O(n)
// Any problem you faced while coding this : N/A

import java.io.*;

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
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        Node newNode = new Node(data);

        // If Stack is empty
        if(list.head == null) {
            list.head = newNode;
            return list;
        }

        Node currentNode = list.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // If Stack is empty
        if(list.head == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node currentNode = list.head;
        while (currentNode.next != null) {
            System.out.print(currentNode.data + ", ");
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
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