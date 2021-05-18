import java.io.*;

// Time Complexity : Insertion - O(N) and Traversal is O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Java program to implement
// a Singly Linked List
public class LinkedList {

  static Node head; // head of list

  // Linked list Node.
  // This inner class is made static
  // so that main() can access it
  static class Node {

    int data;
    Node next;

    // Constructor
    Node(int d)
    {
      //Write your code here
      this.data = d;
      this.next = null;
    }
  }

  // Method to insert a new node
  public static LinkedList insert(LinkedList list, int data)
  {
    // Create a new node with given data
    Node newNode = new Node(data);

    // If the Linked List is empty,
    // then make the new node as head
    if(list.head == null){
      head = newNode;
    }else{
      // Else traverse till the last node
      // and insert the new_node there
      Node dummy = head;
      while(dummy.next != null){
        dummy = dummy.next;
      }
      // Insert the new_node at last node
      dummy.next = newNode;
    }
    // Return the list by head
    return list;
  }

  // Method to print the LinkedList.
  public static void printList(LinkedList list)
  {
    Node pointer = head;
    // Traverse through the LinkedList
    while(pointer != null){
      // Print the data at current node
      System.out.print(pointer.data + " ");
      // Go to next node
      pointer = pointer.next;
    }
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
