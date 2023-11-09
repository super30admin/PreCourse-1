// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : NO

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
            this.data = d;
            this.next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node head = list.head;
        // Create a new node with given data
        Node node = new Node(data);
        // If the Linked List is empty,
        if( head == null ){
            //make the new node as head 
            list.head = node;
        }
        else{
            // Traverse till the last node 
            while(head.next != null ){
                head = head.next;
            }
            // Insert the new_node at last node
            head.next = node;
        }
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        //If the Linked List is empty,
        if(list.head == null)
            return;//Return 
        
        Node node = list.head;
        //Traversing through nodes till it reached null
        while(node != null){
            System.out.println(node.data);  //Print the data at current node 
            node = node.next; // Go to next node 
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