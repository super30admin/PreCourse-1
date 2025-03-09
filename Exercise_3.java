import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
    // Time Complexity :  O(1) addind new Node || O(n) for printing the list
    // Space Complexity : O(N) the size of linkeslist that is being created 
    // Did this code successfully run on Leetcode : 
    // Any problem you faced while coding this : static access modifier caused some confusion whit the functions  

public class Exercise_3 { 
  
     Node head; // pointer to end of list for O(1) insertion
     Node start; // introducing a new variable to point to the starting of the linked list
      
        // Linked list Node. 
        // This inner class is made static 
        // so that main() can access it 
        static class Node { 
            int data; 
            Node next; 
            Node(int d) 
            { 
                this.data = d;
            } 
        } 
        Exercise_3(){
            this.start = null;
            this.head = start;
        }
      
        // Method to insert a new node 
        public static Exercise_3 insert(Exercise_3 list, int data) 
        { 
            // Create a new node with given data 
            Node current = new Node(data);
            // If the Linked List is empty
            // inserting a new node at the end with the help of head in O(1) time complexity
                if(list.start == null) {
                    list.start = current;
                    list.head = list.start;
                }else{
                    list.head.next = current;
                    list.head = current;
                }
                // Else traverse till the last node 
                // and insert the new_node there 
                
            // Return the list by head 
            return list;
        } 
      
        // Method to print the LinkedList. 
        public static void printList(Exercise_3 list) {  
              // empty LinkedList check then proceede with printing
                      // Traverse through the LinkedList 
            Node dummy = list.start;
            while(dummy!= null) {
                System.out.println(dummy.data); // Print the data at current node 
                dummy = dummy.next;            // Go to next node 
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
  
        // Print the LinkedList 
        printList(list); 
    } 
}