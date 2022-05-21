import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList {

    // Time Complexity : O(n) to insert and to printList
    // Space Complexity : O(n) where n is the size of stack or n is the number of nodes in linked list
    // Any problem you faced while coding this : For some reason, the code gave an error on the class name, so had to
    // remove the public parameter
  
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
            //Write your code here
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
        Node new_node = new Node(data);
        new_node.next = null;
        LinkedList new_list = new LinkedList();

        if(list.head == null){
            new_list.head = new_node;
        }
        else{
            Node temp = list.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new_node;
            new_list.head = list.head;
        }
        return new_list;
    }
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node
        Node temp = list.head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
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