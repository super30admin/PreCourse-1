import java.io.*;

  //Time complexity: O(1) for insert operation at head, O(n) for insert operation at tail and O(n) printList operation
  //Space complexity: O(n) as the singly linked list grows

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
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null)
        {
            list.head = newNode;
            return list;
        }
        
            // Else traverse till the last node 
            // and insert the new_node there 
            
            Node temp = list.head;
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newNode;

            // Insert the new_node at last node 
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        // Print the data at current node        
        // Go to next node 

        Node temp = list.head;

        while(temp.next != null)
        {
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