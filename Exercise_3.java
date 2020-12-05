import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 

    /*
    making this node static so that in memory i can have it
     */
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
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head
        if (list.head == null){
            newNode.next = list.head;
        }
        else{
            // Else traverse till the last node
            // and insert the new_node there
            Node tail = list.head;
            while(tail!=null){
                tail = tail.next;
            }
            tail.next = newNode;
        }
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        //check if the list is null
        if (list.head == null){
            System.out.println("The list does not have nodes in it. Stack Underflow");
        }

        else{
            Node tail = list.head;
            // Traverse through the LinkedList
            while(tail!=null){
                // Print the data at current node
                System.out.println(tail.data);
                // Go to next node
                tail = tail.next;
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
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the LinkedList 
        printList(list); 
    } 
}