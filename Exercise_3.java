import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
// Time Complexity : o(n)
// Space Complexity :o(n)
// Did this code successfully run on Leetcode : N/A it is not a leetcode problem
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach
// 1.create node with data and next node and constructor
//2. insert new node: create new node with data. If list is empty then make new node as head. Else traverse until last node and insert new node to last node next.

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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = new_node;
        }else{
             // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }
               // Insert the new_node at last node 
            last.next = new_node;

        }
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        // Print the data at current node 
        // Go to next node 
        Node currNode = list.head;
        System.out.println("LinkedList. ::");
        while(currNode!=null){
             // Print the data at current node 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next;
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