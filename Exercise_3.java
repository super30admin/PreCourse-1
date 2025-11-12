// Time Complexity : O(1) for insert and O(N) printList because of the traversal from head to last node.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Did not find it on Leetcode
// Any problem you faced while coding this : Updated the insert() using tail pointer. Time complexity changed from O(N) to O(1) for insert().
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class Exercise_3 { 
  
    Node head; // head of list 
    Node tail; // tail of list
  
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
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head and tail

        if (list.head == null) {
            list.head = newNode;
            list.tail = newNode;
        } else {
            // Insert the new_node at last/tail node 
            list.tail.next = newNode;
            list.tail = newNode;
        }

        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
        Node currentNode = list.head;

        while (currentNode != null) {
   
            // Print the data at current node 
            System.out.println(currentNode.data);
       
            // Go to next node 
            currentNode = currentNode.next;
        }
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
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