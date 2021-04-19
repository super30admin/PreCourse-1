// Time Complexity :    O(n)
// Space Complexity :   O(n)
// Did this code successfully run on Leetcode : Not found on leetcode
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
            this.data=d;
        } 
    } 
  
    // Method to insert a new node 
      static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        Node curr=list.head;
        Node newNode = new Node(data);
        if(list.head==null){ //If linkedlist is empty
            list.head=newNode;
            return list;
        }
        while(curr.next!=null){
            curr=curr.next; //Traverse till the list till next becomes null
        }
         //create a new node
        curr.next=newNode;
        return list;
        
    } 
  
    // Method to print the LinkedList. 
      static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
            Node curr=list.head;
            while(curr!=null){
                System.out.println("Element "+ curr.data);
                curr=curr.next;
            }
    } 
   
    // Driver code 
    public static class main{
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
}