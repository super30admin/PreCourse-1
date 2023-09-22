//Time complexity - O(n)
//Space complexity - O(1)
//code sucessfully run on the local
//I didnt face any problem while coding this
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
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node temp = new Node(data);
        temp.next = null;
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = temp;
        }else{
            Node lastNode = list.head;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = temp;
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
        Node currentNode = list.head;
        while(currentNode != null){
            System.out.println("Current Node in the Singly Linked List " + currentNode.data);
            currentNode = currentNode.next;
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