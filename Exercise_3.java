import java.io.*; 
  
// Java program to implement 
// Time Complexity :O(n) for insert and printList
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :ran code locally
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newnode = new Node(data);
        // if linkedlist is empty then make newnode as head
        if (list.head == null) { 
            list.head = newnode; 
        } 
        // else traverse till the last node and insert there 
        else { 
            Node currnode = list.head; 
  
            // traverse till the last node 
            while (currnode.next != null) { 
                currnode = currnode.next; 
            } 
  
            // Insert the newnode at last node 
            currnode.next = newnode; 
        } 
  
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node currnode = list.head; 
  
        // traverse the LinkedList 
        while (currnode != null) { 
            System.out.print(currnode.data + " "); 
  
            // go to next node 
            currnode = currnode.next; 
        } 
        System.out.println(); 
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