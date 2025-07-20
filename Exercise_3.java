import java.io.*;
// Java program to implement
// a Singly Linked List

// Time Complexity :
// insert() - O(n), where n is the number of nodes (because we traverse to the end)
// printList() - O(n), to traverse all elements

// Space Complexity : O(n), for storing n nodes in the list

// Did this code successfully run on Leetcode : yes

// Any problem you faced while coding this :
// No major issues. Needed to ensure correct traversal and handling of empty list case.

// Your code here along with comments explaining your approach:
// I implemented a singly linked list with a nested static Node class.
// The `insert()` method adds new nodes to the end of the list.
// The `printList()` method iterates from head to null, printing node data.
// Java program to implement 
// a Singly Linked List 
class LinkedList {
  
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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty, make the new node as head
        if (list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = newNode;
        }

        // Return the list
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        Node currNode = list.head;

        // Traverse through the LinkedList
        System.out.print("LinkedList: ");
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
        System.out.println();
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