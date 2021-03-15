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
        }
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);

        if(list.head==null){
            list.head = newNode;
            return list;
        }
        Node currNode = list.head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;

        return list;
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
        // Traverse through the LinkedList 
        Node currNode = list.head;
        if(currNode==null) return;
        // Print the data at current node
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
        // Go to next node
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

/*
 *  Time Complexity: O(N) for insertion as we need to traverse through the entire list to add a new element
 *  Space Complexity: O(N) to store all the node information.
 * 
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 * 
 *  Simply traverse through all the node from the head to the last and append the next element.
 */


