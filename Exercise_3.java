/*********** Not Sure about space complexity *******/


// import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
class LinkedList { 
  
    Node head ; // head of list 
  
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
            this.next= null;

        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)          // **** Time Complexity O(n) ***********
    {   
        Node newNode = new Node(data);  // Create a new node with given data 
        Node trav = list.head;
        if (list.head == null) {         // If the Linked List is empty,
            list.head = newNode;        // then make the new node as head
        }
        else{
            while(trav.next!=null){        // Else traverse till the last node 
                trav = trav.next;
            }
            trav.next = newNode;           // and insert the new_node there 
                                          // Insert the new_node at last node 
        } 
        return list;                        // Return the list by head    
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list)                       // **** Time Complexity O(n) ***********
    {  
        Node trav = list.head;      
        while(trav != null){                        // Traverse through the LinkedList 
                System.out.println(trav.data);      // Print the data at current node 
                trav= trav.next;                    // Go to next node 
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