//Space Time Complexity : O(N) (this is worst case but depends on situation)
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
            //Write your code here
            this.data = d;
            this.next = null;
        } 
    } 

    boolean isEmpty(){
        if(head==null)
            return true;
        else
            return false;
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
            Node n = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
            if(list.isEmpty())
                list.head = n;
            else
            {
                Node currentNode = list.head;
                // Else traverse till the last node
                while(currentNode.next!=null)
                    currentNode = currentNode.next;

                // and insert the new_node there
                currentNode.next = n;
            }
            // Insert the new_node at last node 
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node n = list.head;
            // Print the data at current node 
       while(n!=null) {
           System.out.print(n.data);
           // Go to next node
           if(n.next!=null)
               System.out.print("->");
           n = n.next;
       }
    } 
   
    // Driver code

    public static void main(String[] args) 
    { 
        /* Start with the empty list.*/
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