// Excercise - 3

// Time Complexity : 
// insert - worst case O(n) as we are traversing till the end to insert node
// print - O(n) if n nodes in linked list
// Space Complexity : O(n) where n is the no of nodes inserted in list
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
        Node head = list.head;
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(head == null)
            {
                head = newNode;
            }
        // Else traverse till the last node 
        // and insert the new_node there 
        else {
            Node ptr = head;
            while(ptr.next != null) {
                ptr = ptr.next;
            }
            // Insert the new_node at last node 
            ptr.next = newNode;
        }
        list.head = head;
        // Return the list by head
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node ptr = list.head;
        while(ptr.next != null) {
            // Print the data at current node 
            System.out.println(ptr.data);
            // Go to next node 
            ptr = ptr.next;
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
