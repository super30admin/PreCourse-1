import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head = null; // head of list 
  
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
        LinkedList temp = list;
        Node new_node = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(head == null){
            head = new_node;
        }
        else{
            // Else traverse till the last node 

            while(temp != null){
                temp = temp.next;
            }
            // Insert the new_node at last node 

            temp = new_node;


        }
        return head;
        
            

            
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node temp = head;

        if(list == null){
            System.out.println("There is no LL");
        }
        else{
            while(temp != null){
                 // Print the data at current node 
                System.out.println(temp.data);
                // Go to next node 
                temp = temp.next;
            }
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

// Time Complexity : O(n)
// For Insertion It will take n time 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// If My head is empty then There is no Linked List. If My head is not null I need to traverse till my last node using temp node.
// Initially assigning temp to head and traversing till my temp is eual to null. if my temp is null then I will assign the new node to temp.
// To print node data need to traverse Linked List using temp node till my temp is equal to null.
