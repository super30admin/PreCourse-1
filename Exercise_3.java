import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

// Time Complexity : insert: O(1), Search O(1), Delete: (n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this : No

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
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null)
            list.head = newNode;
        else{
                Node cur = list.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = newNode;
        }
        // Else traverse till the last node
        // and insert the new_node there
        return list;
        // Insert the new_node at last node
        // Return the list by head
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList

        // Print the data at current node

        // Go to next node
        Node cur = list.head;
        while(cur != null){
            System.out.println(cur.data);
            cur = cur.next;
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