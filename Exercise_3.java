/* Time Complexity : O(N) for insert(), printList() operation where N is the max size of stack data  
   Space Complexity : O(N) where N is max size of list.
*/

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
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
            data = d;
        }
        Node(){
            
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
        if(list.head == null){
            head = new Node(data);
            //System.out.println(head);
        }else{
            Node temp = new Node();
            temp = head;
            //System.out.println(temp);
            while(temp != null && temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
        if(list.head != null){
            Node temp = new Node();
            temp = head;

            while(temp != null){
                System.out.println(temp.data);
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
        list = LinkedList.insert(list, 1); 
        list = LinkedList.insert(list, 2); 
        list = LinkedList.insert(list, 3); 
        list = LinkedList.insert(list, 4); 
        list = LinkedList.insert(list, 5); 
  
        // Print the LinkedList 
        LinkedList.printList(list); 
    } 
}