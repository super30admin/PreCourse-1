import java.io.*; 


// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO
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
            this.data=d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 

        // Create a new node with given data 
        Node new_node = new Node(data);
        new_node.next=null;
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null){
            list.head=new_node;   
        }

        // Else traverse till the last node 
        // and insert the new_node there 
        else{
            Node temp = list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }  

        // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node temp = list.head;
        if(temp!=null){
            // Traverse through the LinkedList 
            while(temp!=null){
                // Print the data at current node 
                System.out.println(temp.data);
                // Go to next node 
                temp=temp.next;
            }
        }
        else{
            System.out.println("Empty");
        }        
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 

        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}