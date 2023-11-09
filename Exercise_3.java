// Time Complexity : O(n)
// Space Complexity : O(n)

import java.io.*;
  
// Java program to implement 
// a Singly Linked List 
class LinkedList {
  
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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if( list.head == null){
            list.head = newNode;
        }else{
            Node tempNode = list.head;
            // Else traverse till the last node
            // and insert the new_node there
            while (tempNode.next != null){
                tempNode = tempNode.next;
            }
            // Insert the new_node at last node
            tempNode.next = newNode;
        }

        // Return the list by head
        return  list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        // check if the LinkedList is empty
        if( list.head == null){
            System.out.println("List is empty");
        }else{
            Node tempNode = list.head;

            // Traverse through the LinkedList
            while (tempNode.next != null){
                // Print the data at current node
                System.out.print(tempNode.data+" ");
                // Go to next node
                tempNode = tempNode.next;
            }
            // print the last value also
            System.out.print(tempNode.data+" ");
        }
    } 
   

}

// Driver code
public class Exercise_3 {

    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = LinkedList.insert(list, 1);
        list = LinkedList.insert(list, 2);
        list = LinkedList.insert(list, 3);
        list = LinkedList.insert(list, 4);
        list = LinkedList.insert(list, 5);

        // Print the LinkedList
        LinkedList.printList(list);
    }
}
