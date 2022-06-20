//Time complexity: O(1)
//Space complexity : O(n)
//Successfully executed on leetcode


import java.io.*;
// Java program to implement 
// a Singly Linked List 
public class LinkedList1 { 
  
    static Node head; // head of list 
    static Node node; //for traversing
  
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
    public static LinkedList1 insert(LinkedList1 list, int data) 
    { 
        // Create a new node with given data 
        Node newnode = new Node(data);
        Node last = head;

        // LinkedList<Integer> list1 = new LinkedList<Integer>();
        // list1 = list;

        // If the Linked List is empty, 
        // then make the new node as head 
        if(head == null)
            {
                //list1.add(head);
                head = newnode;
            }
        // Else traverse till the last node 
        // and insert the new_node there
        else{
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = newnode;
        }

        
        return list; 

            // Insert the new_node at last node 
        // Return the list by head   
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList1 list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
       Node last = head;
            if(head == null)
            {
                System.out.println(0);
            }
        else{
            while(last.next != null)
            {
                System.out.println(last.data);
                last = last.next;
            }
            System.out.println(last.data);
        }
            
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList1 list = new LinkedList1(); 
  
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