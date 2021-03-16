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
            this.next=null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        Node curr=new Node(data);
        if(list.head==null)
        {
            list.head=curr;
        }
        else
        {
            Node temp=list.head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=curr;
        }
        return list;
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
       Node curr=list.head;
       while(curr!=null)
       {
           System.out.print(curr.data+" ");
           curr=curr.next;
       }
       System.out.println("");
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
