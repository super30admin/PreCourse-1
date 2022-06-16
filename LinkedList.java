// Time Complexity : O(1)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : N/A
import java.io.*;
  
// Java program to implement 
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
        Node headNode = list.head; // creating reference node so that we can return list.head at last
        // If the Linked List is empty, 
        // then make the new node as head
        if(list.head == null){
            list.head = node; // if current head is null then assign input data in list.head
        }else{
            // Else traverse till the last node
            // and insert the new_node there
            while(headNode.next != null){
                headNode = headNode.next; //traverse to the last node
            }
            headNode.next = node; // Insert the new_node at last node
        }
        return list;
        // Return the list by head 

    }
  
    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
            Node traversingNode = list.head;
        System.out.println("Excercise 3: Linked List: ");
            while(traversingNode.next != null){ //traverse the nodes
                System.out.println(traversingNode.data);
                traversingNode = traversingNode.next;
            }
            // Print the data at current node

            // Go to next node
    }
}