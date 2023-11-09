// Time Complexity : insert O(N)
// Space Complexity : O(N) and extra  memory for pointers
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Java program to implement
// a Singly Linked List 
public class Exercise_3 {
  
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
    public static Exercise_3 insert(Exercise_3 list, int data)
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
        newNode.next = null;
        // If the Linked List is empty, 
        // then make the new node as head
        if(list.head == null){
            list.head = newNode;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while(last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = newNode;
        }
        // Return the list by head
        return list;
    } 
  
    // Method to print the Exercise_3.
    public static void printList(Exercise_3 list)
    {  
        // Traverse through the Exercise_3
        Node traveler = list.head;
        while( traveler != null){
            // Print the data at current node
            System.out.print(traveler.data +" -> ");
            // Go to next node
            traveler = traveler.next;
        }
    }
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Exercise_3 list = new Exercise_3();
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
  
        // Print the Exercise_3
        printList(list); 
    } 
}