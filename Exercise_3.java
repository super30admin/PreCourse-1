import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
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
            data = d;
            next = null;
            
            
        } 
    } 
  
    // Method to insert a new node 
    //Time complexity O(n) since we are traversing the whole linked list
    //Space complexity O(n) creating a new node
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newnode = new Node(data);
        newnode.next = null;
        
        
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null)
        {
          list.head = newnode;
          
          
            
        }
        
        
            // Else traverse till the last node 
            // and insert the new_node there 
            // creating a temp reference node to the head node and traversing
        else
        {
            Node temp = list.head;
            while(temp.next!= null)
            {
                temp = temp.next;
            }
            
            temp.next = newnode;
            
        }

            // Insert the new_node at last node 
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    //Time Complexity O(n) since we are traversing the whole list
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node traver = list.head;
        while(traver!= null)
   
   {
        // Print the data at current node 
       System.out.println(traver.data);
       // Go to next node 
       traver=traver.next;
            
            
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