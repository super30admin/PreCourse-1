// Time Complexity : O(n) (as we traverse to the last node and then add a new node)
// Space Complexity : O(n) (n-number of nodes)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to change the name of the class as it didn't //run on leetcode


import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList1 { 
  
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
            //Initializing fields
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList1 insert(LinkedList1 list, int data) 
    { 
        // Create a new node with given data 
        Node node = new Node(data);
        node.next = null;
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null)
            list.head = node;
            // Else traverse till the last node 
            // and insert the new_node there 
        else
        {
            Node temp = list.head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            // Insert the new_node at last node 
            temp.next = node;
        }
        // Return the list by head 
        return list;    
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList1 list) 
    {  
        Node temp = list.head;
        // Traverse through the LinkedList 
        while(temp!=null)
        {
            // Print the data at current node 
            System.out.println(temp.data);
            // Go to next node 
            temp = temp.next;
        }         
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList1 list = new LinkedList1(); 
  
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