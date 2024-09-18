import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list
    Node tail; 
  
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
            data =d;
        } 
    }
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node nw = new Node(data);
        nw.next=null;
        Node head = list.head;
        Node tail = list.tail;
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(head==null){
            head=nw;
            tail=nw;
        }
            // Else traverse till the last node 
            // and insert the new_node there 
        else {
            tail.next=nw;
            tail=tail.next;
        }    
            // Insert the new_node at last node 
            
        // Return the list by head
        list.head = head;
        list.tail = tail;
        return list;
    }  
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node curr=list.head;
        
        // Traverse through the LinkedList 
        while (curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
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