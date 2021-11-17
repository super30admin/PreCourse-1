import java.io.*; 
  
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
            data = d;
        } 
    } 
  
    // Method to insert a new node
    // Time Complexity = O(n)
    // Space Complexity= O(1)
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        if(list.head ==null){
            Node new_node = new Node(data);
            list.head = new_node;
        }
        else{
            Node list_copy = list.head;
            while(list_copy.next!=null){
                list_copy= list_copy.next;
            }
            list_copy.next = new Node(data);
        }
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node 
            Node copy = list.head;
            while(copy!=null){
                System.out.println(copy.data);
                copy = copy.next;
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