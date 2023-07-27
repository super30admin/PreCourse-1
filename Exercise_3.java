import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
//Time Complexity: O(N) because for insert, we may need to traverse the entire list to find the last node,
                // and for printList, we neeed to traverse through the entire list once to print
//Space Complexity: O(1) for all the methods because we use a fixed amount of memory for storing the nodes
    
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
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = newNode;
        }else{
            // Else traverse till the last node 
            // and insert the new_node there 
            Node end = list.head;
            while(end.next != null){
                end = end.next;
            }
        }
     

        // Insert the new_node at last node 
        end.next = newNode;
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        Node curr = list.head;
        System.out.print("LinkedList: ");
        // Traverse through the LinkedList 
        while(curr != null){
            // Print the data at current node
            System.out.print(curr.data + " ");
            // Go to next node
            curr = curr.next;
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