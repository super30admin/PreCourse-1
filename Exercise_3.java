// Time Complexity : insert : O(N) where N is the size of the List
//                      print: O(N) where N is the size of the List
// Space Complexity : O(N) where N is the size of the list
// Did this code successfully run on Leetcode : Ran it locally on IDE and works
// Any problem you faced while coding this : No


import java.io.*;

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
            //Write your code here
            this.data = d;
            this.next = null;
        }
    }
    /*
      if head is not null, traverse the list until the last node and then
      add a new node there and if head is null, assign head to the new node
    */
    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
        // Return the list by head

        if(list.head != null){
          Node temp = head;

          while(temp.next != null){
            temp = temp.next;
          }

          temp.next = new Node(data);
          return list;
        }

        list.head = new Node(data);
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList

            // Print the data at current node

            // Go to next node
        if(list.head != null){
          Node temp = head;
          while(temp != null){
            System.out.System.out.print(temp.data + " -> ");
            temp = temp.next;
          }
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
