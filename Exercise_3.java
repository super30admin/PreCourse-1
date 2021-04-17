// Time Complexity :    O(n) // Need to traverse till end of the list to insert a new node
// Space Complexity :   O(n) // Extra memory for creating head pointer to keep updating head
// Did this code successfully run on Leetcode : Did not find on leetcode
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
            this.data=d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {

        Node current=list.head;

        if(list.head==null) {       // if list is empty then head will be null
            list.head = new Node(data); // create new node
            return list;                 // return list
        }

        while(current.next!=null){ // traverse till last element is null
            current=current.next;
        }

        Node newNode = new Node(data); // create new node
        current.next=newNode;     // assign current to newly created node so it
                                 // becomes the last element
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {

        Node current= list.head;
        while(current!=null){  // traverse list until you reach end of list
            System.out.println("Data is :"+current.data);
            current=current.next; // increment the next pointer
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
