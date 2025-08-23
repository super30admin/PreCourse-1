// Time Complexity :  O(1) - insertion in front
//                    O(n) - insertion at the end since we need to traverse to last element
// Space Complexity : O(n) where n number of nodes
// Any problem you faced while coding this : no (only forgot that in printing we need to traverse like temp != null instead of temp.next != null)

import java.io.*;
import java.util.List;

// Java program to implement
// a Singly Linked List
class LinkedList {

  Node head; // head of list

  // Linked list Node.
  // This inner class is made static
  // so that main() can access it
  static class Node {

    int data; // the value stored
    Node next; // points to the next node

    // Constructor
    Node(int d) {
      this.data = d;
      this.next = null;
    }
  }

  // Method to insert a new node
  public static LinkedList insert(LinkedList list, int data) {
    // Create a new node with given data
    Node newNode = new Node(data);

    if (list.head == null) {
      // If the Linked List is empty,
      // then make the new node as head
      list.head = newNode;
    } else {
      // Else traverse till the last node
      // and insert the new_node there
      Node temp = list.head;
      while (temp.next != null) {
        temp = temp.next;
      }
      // Insert the new_node at last node
      temp.next = newNode;
    }

    // Return the list by head
    return list;
  }

  // Method to print the LinkedList.
  public static void printList(LinkedList list) {
    // Traverse through the LinkedList
    Node temp = list.head;

    while (temp != null) {
      // Print the data at current node
      System.out.print(temp.data + " -> ");
      // Go to next node
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
    list = insert(list, 1);
    list = insert(list, 2);
    list = insert(list, 3);
    list = insert(list, 4);
    list = insert(list, 5);

    // Print the LinkedList
    printList(list);
  }
}