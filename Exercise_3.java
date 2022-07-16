// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Faced issues while compiling since the class name didn't mactch with filename
//                                           got error: "Exercise_3.java:5: error: class LinkedList is public, should be declared in a file named LinkedList.java"

import java.io.*; 
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data=d;
            next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newNode= new Node(data);
        newNode.next=null;

        if(list.head==null){
            list.head=newNode;
        }
        else{
            Node cur=list.head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node cur=list.head;
        while(cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
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