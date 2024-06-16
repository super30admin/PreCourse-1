/*
    Time Complexity : O(n)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode :
*/ 

// Your code here along with comments explaining your approach
import java.io.*; 
  
class LinkedList { 
  
    Node head;
    static class Node { 
        int data; 
        Node next; 
        Node(int d) { 
            data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) { 
        Node newNode = new Node(data);
        if(list.head == null) {
            list.head = newNode;
        } else {
            Node lastNode = list.head;
            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {  
        Node node = list.head;
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
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