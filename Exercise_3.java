import java.io.*; 
  
// Java program to implement 
// a Singly Linked List
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No
// Your code here along with comments explaining your approach
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
            this.data=d;
            this.next=null;
        } 
    } 
  
// Time Complexity : O(N)
// Space Complexity :O(N)
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node dummy=head;
            while(dummy.next!=null){
                dummy=dummy.next;
            }
            dummy.next=newnode;
        }

        return list;
    } 
  
// Time Complexity : O(N)
// Space Complexity :O(N)
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node
            if(head==null){
                System.out.println("List is empty");
            }
            else{
                Node dummy=head;
                while(dummy!=null){
                    System.out.println(dummy.data);
                    dummy=dummy.next;
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
