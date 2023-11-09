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
            data=d;
            next=null;
            //Write your code here 
        } 
    } }
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   Node new_n= new Node(data);
new_n.next=null;
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head==null)
{
   list.head=new_n;
}        
            // Else traverse till the last node 
            // and insert the new_node there 
            Node dummy=list.head;
            while(dummy.next!=null){
dummy= dummy.next;

            }
            dummy.next= new_n;
        }
        return list;

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node current= head;
        // Traverse through the LinkedList 
   while(current.next!=null){
       System.out.println(current.data);
       current= current.next;
   }
            // Print the data at current node 
       
            // Go to next node 
    } 
}
   
    // Driver code 
    class Main{
    
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
