// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
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
        Node(int d)   //thios is a constructor which is initializing a node data and setting a next as null
        { 
            this.data=d;
            this.next=null;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node node = new Node(data);                     //to insert first we are creating a node and initializing data with the value passed
        if(list.head==null){                            //Checking if head of the list is null if so we will make the node as head
            list.head=node;
        }   
        else{                                           //if head is not null then we will traverse till the end of the list and attach the new node at the end and return a list
            Node temp=list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        return list;
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list)  //This function checks if list is empty if not then it prints the value of every node in the list
    {  
        Node temp=list.head;
        if(temp==null){
            System.out.println("List is empty");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
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