import java.io.*;

// Time Complexity:
// insert()    => O(n)   [traverses to end of list]
// printList() => O(n)

// Space Complexity:
// O(n), where n is the number of nodes in the list

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
            data = d; // assigning d to data
            next = null; // next will be null
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null; // create a new Node and assign data to new Node, null to next
   
        // If the Linked List is empty, 
        // then make the new node as head
         if (list.head == null)
             list.head = newNode;
        
            // Else traverse till the last node 
            // and insert the new_node there
         else {
             Node lastNode = list.head;
             while (lastNode.next != null){
                 lastNode = lastNode.next;
             }
             lastNode.next = newNode;
         }

        return list;

    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        Node currNode = list.head;
        // Traverse through the LinkedList
        // Print the data at current node
        // Go to next node
        while (currNode != null){
            System.out.println(currNode.data + " ");
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