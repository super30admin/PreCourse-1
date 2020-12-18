// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Not Tried
// Any problem you faced while coding this : No

//Steps
//1) insert
     //a) Create a new node. 
     //b) Check whether list.head is null or not. If it is null then assign new node to list.head, otherwise create a reference object pointing towards head.
     //c) Then traverse that reference object till reference object.next is not null. After that stop the traversal and insert the new node on reference object.next
     //d) Then return the list
//2) printList
     //a) Create a reference object pointing towards head and then traverse the list by moving the reference object.       

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
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        Node node = new Node(data);
        if(list.head==null){
            list.head = node;
        }else{
           Node curr =  list.head; 
           while(curr.next!=null){
               curr = curr.next;
           }
          
           curr.next = node;
           
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
            Node curr = list.head;
            while(curr!=null){
                System.out.println(curr.data);
                curr = curr.next;
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