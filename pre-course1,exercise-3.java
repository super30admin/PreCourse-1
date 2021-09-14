// Time Complexity : adding one element is o(1),but printing an element is o(n) because we have to iterate all elements.
// Space Complexity :12+12 for three integers variable.
// Did this code successfully run on Leetcode :no got errors.
// Any problem you faced while coding this :yes regarding cannot find variable.


// Your code here along with comments explaining your approach ;- defined every function using pointers.

import java.io.*; 
  
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
            data=d;
            next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {   Node n1=new Node(data);
        n1.next=null;
        // Create a new node with given data
        if(list.head==null){
            list.head=n1;
        }
        // If the Linked List is empty, 
        // then make the new node as head 
        else{
            n1=list.head;
            while(n1.next!=null){
                Node next=n1.next;
                
            }
            n1.data=data;
        }
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
             Node n2= list.head;
            while(n2.next!=null){
                System.out.println(n2.data);
                Node next=n2.next;
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