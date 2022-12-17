//time complexity for both the methods is O(length of linkedlist)
//space complexity for both the methods is O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class  LinkedList{ 
  
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
            //initialize data with d
            data=d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
           Node newNode =new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null){
            list.head=newNode;
        }
        
            // Else traverse till the last node 
            // and insert the new_node there 
        else{
            Node tempNode=list.head;
            while(tempNode.next!=null)
             tempNode=tempNode.next;
            // Insert the new_node at last node 
            tempNode.next=newNode;
        }     
        // Return the list by head 
        return list;       
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
          Node tempNode=list.head;
          while(tempNode!=null){
            // Print the data at current node
            System.out.println(tempNode.data);
            // Go to next node 
            tempNode=tempNode.next;
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