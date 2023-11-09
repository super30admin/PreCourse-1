// Time Complexity : O(n) -> for the printlist function
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this :    No
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
        Node(int d) 
        { 
            //assign the value to data of the node 
            this.data=d;
            //point next to null
            this.next=null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // Create a new node with given data 
        Node newnode=new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null) {
            //as its the first element head will be newnode
            list.head=newnode;
        }
        // Else traverse till the last node 
        // and insert the new_node there
        else{
            Node ptr=list.head;
            //increment the next ptr till last node is reached
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            //point next of last node to new node
            ptr.next=newnode;
        }
            
        return list;  
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        // Traverse through the LinkedList 
        //note the head into a node 
        Node curr=list.head;
      
        //increment the node while last node is reached
        while(curr!=null){
            //print the value of node 
            System.out.println(curr.data);
            //go to next node
            curr=curr.next;
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