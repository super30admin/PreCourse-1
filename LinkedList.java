// Time Complexity : O(n) PrintList functions needs a traversal from start to end of the linkedlist
// Space Complexity : 0(1) Inserted fixed number of elements into the LinkedList and using only one extra node (pointer) to traverse
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
    // Node tail;
    // Node root;
  
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
              this.data = d; //assign value to Node data
              this.next = null; //points to null initially
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){ // Head and tail points to root initially
            list.head = newNode;
            // list.tail = newNode;
            // list.root = newNode;
            return list;
        } else { // Else traverse till the last node and insert the new_node there
            // and insert the new_node there 
            Node pointer = list.head;
            while(pointer.next!=null){
                pointer = pointer.next;
            }
           pointer.next = newNode;  
        //    list.tail = newNode;
        //    list.tail.next = null;
           return list; 
        }
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node pointer = list.head;
        // Traverse through the LinkedList 
       while(pointer!=null){
        System.out.println(pointer.data); // Print the data at current node 
        pointer = pointer.next;  // Go to next node 
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