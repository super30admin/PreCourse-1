import java.io.*; 
  
// Time Complexity :
/*  insert(LinkedList list, int data) : O(n)
 *  printList(): O(n)
 * 
 */
// Space Complexity : O(n)

// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this : None

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
            this.data= d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 

        //Created pointer for head
       Node pointer= list.head;
       //Checking if list is empty
        try{
            int check= pointer.data;
            // Finding the last element of the list
            while(pointer.next!=null){
                pointer= pointer.next;
            }
            // Pointing the last element to new node
            pointer.next= new Node(data);

            

        }

        // List is empty, so creating head
        catch(Exception e){
            list.head= new Node(data);
            
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 

            // Created a pointer
            Node pointer= list.head;
            // Iterating the list and printing
            while(pointer.next!=null){
                System.out.println(pointer.data);
                pointer=pointer.next;
            }
            // Printing the last element
            System.out.println(pointer.data);
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
        list = insert(list, 6); 
        printList(list);
    } 
}