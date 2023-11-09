import java.io.*;
// Time Complexity :Insertion/Deletion at head:O(1), Insertion/Deletion in the middle : O(N),Insertion/Deletion at the end:O(N),
//                  Access head:O(1), Access a middle Node:O(N) Access end:O(N)
//
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

// Java program to implement 
// a Singly Linked List 
class LinkedList {

    static Node head; // head of list
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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    { 
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the Linked List is empty,
        if(list.head == null){
            // then make the new node as head
            list.head = newNode;
        }
        else{
            Node traverseNode = list.head;
            // Else traverse till the last node
            while(traverseNode.next != null){
                traverseNode = traverseNode.next;
            }

            // and insert the new_node there
            // Insert the new_node at last node
            traverseNode.next = newNode;

            // Return the list by head

        }


        return list;
    }
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {  

         Node printNode = list.head;
        // Traverse through the LinkedList
        System.out.print("Linked List is : ");
        while(printNode != null)
        {
            // Print the data at current node
            System.out.print(printNode.data +" ");
            // Go to next node
            printNode = printNode.next;
        }

    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 

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
