import java.io.*; 
  
// Java program to implement 
// a Singly Linked List
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : Yes, while printing i checked for currentNode.next!= null it results in missing the last element
// and also in the start for traversing i used for loop later started while loop. and also instead of creating current node i used the actual head for traversal which results in moving the orginal head, so started using another node so not moving the actual head



// Your code here along with comments explaining your approach
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
        Node newNode = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node current = list.head;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newNode;
        }
        return list;

            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node current = list.head;
        while(current !=null){
       System.out.println(current.data);
       current = current.next;
   }
            // Print the data at current node 
       
            // Go to next node 
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