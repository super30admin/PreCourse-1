import java.io.*;

// Java program to implement
// a Singly Linked List
public class LinkedListS30 {

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
        }
    }

    // Method to insert a new node
    public static LinkedListS30 insert(LinkedListS30 list, int data)
    {

        if(list == null){
          return list;
        }
        // Create a new node with given data
        Node currentNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null){
          list.head = currentNode;
        }else{
          // Else traverse till the last node
          // and insert the new_node there

          Node tempNode = list.head;
          while(tempNode.next != null){
            tempNode = tempNode.next;
          }
          // Insert the new_node at last node

          tempNode.next = currentNode;
        }

        return list;
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedListS30 list)
    {
        // Traverse through the LinkedList
        if(list.head == null) return;

        Node tempNode = list.head;
        System.out.printf("%d ", tempNode.data);
        while(tempNode.next != null){
            tempNode = tempNode.next;
            System.out.printf("%d ", tempNode.data);
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedListS30 list = new LinkedListS30();

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
