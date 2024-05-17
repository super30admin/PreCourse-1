// Time Complexity : O(n) for inserting and end of list and traversing. 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

  
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
            this.data = d; 
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) 
    { 
        // craeting new node with given data
        Node new_node = new Node(data);
        if(list.head == null){
            // if list is empty, then put our node at first
            list.head = new_node;
        }else{
            // traverse till the end of list and put our node there.
            Node current_head = list.head;
            while(current_head.next != null){ // if a node does not have a next node then it is the last node.
                current_head = current_head.next; // place our node
            }
            current_head.next = new_node; 
        }
        
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
    
        Node current = list.head;
        while(current != null){ // traversing till there are nodes
            System.out.print(current.data);
            current = current.next;
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