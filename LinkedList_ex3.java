import java.io.*;
import java.util.List;

// Java program to implement
// a Singly Linked List
public class LinkedList_ex3 {

    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            this.data=d;
            this.next=null;
        }
    }
    Node head; // head of list

    public LinkedList_ex3(){
        this.head=null;
    }

    public Node getHead(){
        return this.head;
    }

    public static LinkedList_ex3 insert(LinkedList_ex3 list, int data)
    {

        if(list.head == null){
            list.head = new Node(data);
            return list;
        }

        // If the Linked List is empty,
        // then make the new node as head
        Node temp = list.head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next = new Node(data);
        return list;

            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList_ex3 list)
    {
        // Traverse through the LinkedList
        // Get the head node
        if(list.head==null)
            return;

        Node currentNode = list.head;
        while(currentNode!=null){
            System.out.println(currentNode.data);
            currentNode=currentNode.next;
        }
            // Print the data at current node

            // Go to next node
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList_ex3 list = new LinkedList_ex3();

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