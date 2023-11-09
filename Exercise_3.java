/*Implementation of singly linked list.
  Time Complexity: O(1) for insert and O(n) for printing the elements..
  Space Complexity: O(n) n - number of nodes.
*/

import java.io.*; 
import java.util.*;
  
class LinkedList { 
  
    Node head; // head of list 
    static class Node { 
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) { 
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) { 
        Node newNode = new Node(data);
   
        if(list.head == null) {
            list.head = newNode;
        } else {
            Node tmp = list.head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {  
        Node p = list.head;
        while(p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
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