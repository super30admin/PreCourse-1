// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class Exercise_3 { 
  
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
            this.data=d;
            this.next=null;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node newnode= new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null){
            list.head=newnode;
        }

            // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node temp=list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            // Insert the new_node at last node 
            temp.next=newnode;
        }
        return list;  
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
        Node temp=list.head;
        while(temp!=null)
        {
            // Print the data at current node 
            System.out.println(temp.data);
             // Go to next node 
             temp=temp.next;

        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3(); 
  
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