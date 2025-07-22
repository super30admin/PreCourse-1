// Time Complexity:
// insert - O(n)
// print - O(n)

// Space Complexity: O(n)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No major issues

import java.io.*; 

public class LinkedList { 
  
    Node head; 
  
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
        Node newNode = new Node(data);
   
        if(list.head == null){
            list.head = newNode;
        }else{
            Node curr = list.head;
            while (curr.next != null) {
            curr = curr.next;
            }
            curr.next = newNode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node curr = list.head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
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