//TC: O(2*n)
//SC: O(1)
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
        Node next;  //reference variable
  
        // Constructor 
        Node(int d) 
        { 
            this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)          //TC: O(n), SC: O(1) * n insertions of nodes
    { 
        // Create a new node with given data 
            Node newNode = new Node(data);  //object of Node
        // If the Linked List is empty, 
        // then make the new node as head 
            if(list.head == null){
                list.head = newNode;
            }
            // Else traverse till the last node 
            // and insert the new_node there 
            else{
                Node tmp = list.head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                //assign new node's next to last node's next to store the address of the new node.
                tmp.next = newNode;

            }

        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list)   //TC: O(n) traversing the entire list, SC: O(1) only using temp variable
    {  
         
            Node temp = list.head;

            // Traverse through the LinkedList
            while (temp!= null) {
                System.out.println(temp.data); // Print the data at current node 
                temp = temp.next; // Go to next node 
            }
            
    } 
}

public class Exercise_2{
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = LinkedList.insert(list, 1); 
        list = LinkedList.insert(list, 2); 
        list = LinkedList.insert(list, 3); 
        list = LinkedList.insert(list, 4); 
        list = LinkedList.insert(list, 5); 
  
        // Print the LinkedList 
        LinkedList.printList(list); 
    } 
}