import java.io.*; 
 //Time Complexity  - > O(N)
 //Space Complexity  - > O(N)
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
        Node n = new Node(data);
        n.next = null;
        // If the Linked List is empty,
        if(list.head == null) {
            // then make the new node as head 
            list.head = n;
        }else {
            // Else traverse till the last node 
            // and insert the new_node there 
            // Insert the new_node at last node
           Node temp = list.head;
           while (temp.next != null) {
            temp = temp.next;
           }
           temp.next = n;
        }
        
       
        
            

           
        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) 
    {  
        Node temp = list.head;
        // Traverse through the LinkedList 
        while (temp.next != null) {
            // Print the data at current node 
            System.out.println(temp.data);
            // Go to next node
            temp = temp.next;
        }
        System.out.println(temp.data);
 
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
  
        // Print the LinkedList 
        printList(list); 
    } 
}