import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head=null; // head of list 
  
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
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        Node newNode=new Node(data);
        Node head=list.getFirst();
        
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.isEmpty())
        {
            head=newNode;
            head.next=null;
        }
        else
        {
            while(head.next!=null)
            {
                if(head.next==null)
                {
                    head.next=newNode;
                    newNode.next=null;
                }
                head=head.next;
            }
        }
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node curr=list.getFirst();
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
        // Traverse through the LinkedList 
   
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
