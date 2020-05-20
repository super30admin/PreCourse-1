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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node n = new Node(data);
        if(list.head == null){
            list.head = n;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){  //traverse till last node and insert new node  to it
                temp = temp.next;
            }
            temp.next = n;
        }
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
            Node temp = list.head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
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

// Time Complexity : O(size of linked list)
// Space Complexity : O(1) for insert
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : Nothing