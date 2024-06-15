import java.io.*; 
  

// Time Complexity :O(n)- To traverse the list of size n and append the new Node at the end of list
// Space Complexity :O(1)- doubt since I declare a newNode does it size is O(1)
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : I was slightly confused when the insert function expected to return a linkedlist reference as we used to always return head reference in most of the linkedlist problems.



// Your code here along with comments explaining your approach

// Insertion-> created a new node and a temperorary variable for storing the reference of head. Checked if there is elements existing in the list if yes then traversed through the last element of the list and appended the new/node as last node. If there are no elements in the list then referenced the head node as new noed.
// PrintList-> Traversed through the list and printed every value of the list.

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
        Node(int d) 
        { 
            //Write your code here 
            this.data=d;
            this.next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 

        Node newNode=new Node(data);
        Node temp;

   
        // If the Linked List is empty, 
        // then make the new node as head 

        if(list.head==null){
                list.head=newNode;
        }
           
        
            // Else traverse till the last node 
            // and insert the new_node there 
        else if(list.head!=null){
            temp=list.head;
            while(list.head.next!=null){
                list.head=list.head.next;
            }
            list.head.next=newNode;
            list.head=temp;
        }
        // Insert the new_node at last node 
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 

        while(list.head!=null){
            System.out.print(list.head.data);
            if(list.head.next!=null)
                System.out.print(" -> ");
            list.head=list.head.next;
        }
   
            // Print the data at current node 
       
            // Go to next node 
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