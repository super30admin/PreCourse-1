// Time Complexity :
//      insert() - O(n) - need to traverse the whole ll to insert a new node
//      printList() - O(n) - need to traverse the whole ll to print all the node data.
//      
// Space Complexity :
//      overall - O(n) - space requirement keeps increasing everytime a new node is added
//      insert() - O(1) - need two pointers
//      printList() - N/A
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : No

import java.io.*; 
  
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
            //Write your code here
            this.data = d;
            this.next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {
        Node newNode = new Node(data);

        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null)
        {
            //empty ll
            list.head = newNode;
            return list;
        }
        else
        {
            // Else traverse till the last node 
            // and insert the new_node there
            
            // keep a new pointer to the ll 
            LinkedList dummy = new LinkedList();
            dummy.head = list.head;

            while(dummy.head.next != null)
            {
                dummy.head = dummy.head.next;
            }
            
            // Insert the new_node at last node

            dummy.head.next = newNode; 
            return list; 
        }
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        // Print the data at current node 
        // Go to next node 
        LinkedList dummy = new LinkedList();
        dummy.head = list.head;
        
        if(dummy.head == null)
        {
            //Empty ll
            System.out.print("null");
        }
        else
        {
            //traverse the ll to print out the ll sequence
            while(dummy.head != null)
            {
                System.out.print(dummy.head.data + " -> ");
                dummy.head = dummy.head.next;
            }

            System.out.print("null\n");
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