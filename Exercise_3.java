import java.io.*;

// Time Complexity : O(n) for insert() and printList() - n is the number of nodes in the list.
// Space Complexity : O(1) - Both insertion and printing use constant additional space.
// Did this code successfully run on Leetcode : Local environment ( IntelliJ)
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach
public class LinkedList { 
  
    Node head;
    static class Node {
        int data; 
        Node next;

        Node(int d) 
        { 
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {
        Node insertNode = new Node(data);
        if(list.head == null){
            list.head = insertNode;
            return list;
        }
        Node current = list.head;
        while (current.next != null){
            current = current.next;
        }
        current.next = insertNode;
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node current = list.head;
        while (current.next != null){
            System.out.print(current.data + " -> ");
            current = current.next;
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