// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : No, ran successfully on geeksforgeeks ide, ideone and codechef ide
// Any problem you faced while coding this : Accessing head in insert (static method)



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
            // Initialize class attributes
            data = d;
            next = null; 
        } 
    } 
  
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
        
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
            return list;
        }
       
        Node last_node = list.head;
        while (last_node.next != null) { // traverse till last node
            last_node = last_node.next; 
        }
        last_node.next = new_node; // insert the new_end at the end
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
        Node print_node = list.head;
        System.out.print("The elements in List are : ");
        while(print_node!= null) { // traverse till end of node and print each node
            System.out.print(print_node.data + " ");
            print_node = print_node.next;
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