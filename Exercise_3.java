//Space Complexity = O(n)
//Time Complexity = O(1)

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; 
    
    static class Node { 
  
        int data; 
        Node next; 
   
        Node(int d) 
        { 
        	this.data = d;
        	next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 

    	Node new_node = new Node(data);
        new_node.next = null;
   
        if (list.head == null) 
        {
            list.head = new_node;
        }

        else
        {
        	Node last = list.head;
            while (last.next != null) 
            {
                last = last.next;
            }
            
            last.next = new_node;
        }
     return list;
    } 
   
    public static void printList(LinkedList list) 
    {  
 
    	Node currNode = list.head;
   
    	while (currNode != null) {

            System.out.print(currNode.data + " ");
    
            currNode = currNode.next;
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
