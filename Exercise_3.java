/*
 Time Complexity:
 insert: O(n), print: O(n)
 Space Complexity: O(n)
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No
 */

import java.io.*;
public class LinkedList { 
  
    Node head; // head of list 

    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data=d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    {
        Node node=new Node(data);

        if(list.head==null)
            list.head=node;
        else{
            Node curr=list.head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=node;
        }

        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        if(list.head==null)
            System.out.println("No list to print");
        else{
            Node curr=list.head;
            while(curr!=null){
                System.out.println(curr.data);
                curr=curr.next;
            }
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList(); 

        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 

        printList(list); 
    } 
}