import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    static Node tail;
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            this.data=d;
            //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        // if(head==null)
        // {
        //     Node temp=new Node(data);
        //     head=temp;
        //     tail=temp;
        // }
        // else
        // {
        //     tail.next=new Node(data);
        //     tail=tail.next;
        // }

        if(list.head==null)
        {
            Node node=new Node(data);
            list.head=node;
            return list;
        }
        else
        {
            tail=list.head;
            Node first=tail;
            while(tail.next!=null)
            {
                tail=tail.next;
            }
            tail.next=new Node(data);
            list.head=first;
            return list;
        }
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        while(list.head!=null)
        {
            System.out.println(list.head.data);
            list.head=list.head.next;
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

// Here, I am using 1 for loop, so time compexity is O(n). 