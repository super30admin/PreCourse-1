import java.io.*; 
  
// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


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
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node myNode = new Node(data);
        myNode.next=null;
   
        // If the Linked List is empty, 
        // then make the new node as head 
       
        if(list.head == null)
        {
            list.head=myNode;
        }
        else
        {
             // Else traverse till the last node 
            // and insert the new_node there 
            Node nextNode = list.head;
            while(nextNode.next !=null)
            {
                nextNode = nextNode.next;
            }
            // Insert the new_node at last node 
            nextNode.next=myNode;
        }            
        // Return the list by head
        return list; 
        
    } 
  
    // Method to print the LinkedList.   
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node node = list.head;
        while(node!=null)
        {
            // Print the data at current node 
            System.out.println("Node is:"+node.data);
             // Go to next node 
            node=node.next;
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