// Time Complexity :
// insert, find, remove, printList - O(n) where n is num of elements in LL already, since we need to iterate over the list to perform those operations
// 
// Space Complexity :
// insert(), find(), remove(), printList() - O(1) since each operation uses a constant amount of extra memory

// Did this code successfully run on Leetcode : ran locally - got this output : 1 -> 2 -> 3 -> 4 -> 5 -> null

// Any problem you faced while coding this :
// - missed the last element in the printList logic - realized after printing the solution - fixed later with different approach
// - created LinkedList constructor - not sure if it was needed or not
// - removed public modifier from class since it gave some error when running locally
// - had to review insert logic with Chatgpt first before being able to code it
// also implemented remove and find methods for practice since i saw them in the .py exercise_3 file

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
    Node head; // head of list 

    LinkedList() {
        this.head = null;
    }
  
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
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = node;
        }
            // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node curr = list.head;
            while(curr.next != null){
                curr = curr.next;
            }
            // Insert the new_node at last node
            curr.next = node;
        } 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        if(list.head != null){
            Node curr = list.head;
            while(curr != null){
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.print("null");
        }
        System.out.println(); // just formatting things up
    } 

    // method to remove first occurrence of data in the list (saw it in .py exercise, hence wanted to attempt this as well)
    public static LinkedList remove(LinkedList list, int data) {
        if(list.head == null){
            System.err.println("List is empty, nothing to remove");
            return list;
        }

        Node dummy = new Node(0);
        dummy.next = list.head;
        Node prev = dummy;
        Node curr = list.head;

        while(curr != null && curr.data != data){
            prev = curr;
            curr = curr.next;
        }

        if(curr != null && curr.data == data){
            prev.next = curr.next;
        }
        list.head = dummy.next;

        return list;
    }

    public static boolean find(LinkedList list, int data){
        if(list.head != null){
            Node curr = list.head;
            while(curr.next != null && curr.data != data){
                curr = curr.next;
            }
            if(curr != null && curr.data == data){
                return true;
            }
        }
        return false;
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