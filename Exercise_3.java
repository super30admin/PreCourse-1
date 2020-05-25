/**
 * Time Complexity:
 * insert() : O(n)
 * printList() : O(n)
 *  */ 

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class Exercise_3 {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data =d;
            next=null;
        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data) {
        // Create a new node with given data
        
        Node node = new Node(data);
        node.next = null;

        if(list.head==null){
            list.head=node;
        }
        else{
            Node temp = list.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list) {
        // Traverse through the LinkedList
        Node node = list.head;
        while(node!=null){
            System.out.println(node.data+" ");
            node = node.next;
        }

    }

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3();
  
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