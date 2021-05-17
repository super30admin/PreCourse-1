//import java.io.*; 
  
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
           this.data=d;
           this.next=null; //Write your code here 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node=new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head 
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;                
            }
            current.next=new_node;
        }

        return list;
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            Node curr = head;
            while(curr!=null)
            {
                System.out.println(curr.data);
                curr=curr.next;
            }


        }// Traverse through the LinkedList 
        
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