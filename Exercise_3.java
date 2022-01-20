import java.io.*;

// Time Complexity : O(n)
// Space Complexity : O(n)

// Java program to implement
// a Singly Linked List
public class LinkedList {

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
    // Create a new node with given data
    Node p = new Node(data);

    if (list.head == null) { // If the Linked List is empty, then make the new node as head
      list.head = p;
    } else { // Else traverse till the last node and insert the new_node there
      Node q = list.head;
      while (q.next != null) {
        q = q.next;
      }
      q.next = p; // Insert the new_node at last node
    }
    return list; // Return the list by head
  }

  // Method to print the LinkedList.
  public static void printList(LinkedList list)
  {
    // Traverse through the LinkedList
    // Print the data at current node
    // Go to next node
    Node p = list.head;
    while (p.next != null) {
      System.out.println(p.data);
      p = p.next;
    }
    System.out.println(p.data);
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