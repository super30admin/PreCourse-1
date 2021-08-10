/*Running Time Complexity:O(1)
Space Time Complexity: O(1)
*/
import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class Main { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int data) 
        { 
            //Write your code here 
            this.data = data;
            this.next = next;
        } 
    } 
  
    // Method to insert a new node 
    public static Main insert(Main list, int data) 
    { 
        // Create a new node with given data 
        Node node = new Node(data);
        if(list.head==null){
            list.head = node;
        }
        else{
            Node temp = list.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
        
        return list;
   
        // If the Linked List is empty, 
        // then make the new node as head 
        
            // Else traverse till the last node 
            // and insert the new_node there 

            // Insert the new_node at last node 
        // Return the list by head 
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Main list) 
    {  
        // Traverse through the LinkedList 
        Node temp = list.head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
   
            // Print the data at current node 
       
            // Go to next node 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        Main list = new Main(); 
  
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