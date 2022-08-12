// Time Complexity : 
        // insert = O(n) 
                //we can reduce O(insertion) to O(1) if we use tail pointer pointing at end of the list
        // printList = O(n)
// Space Complexity : O(n) 

// Did this code successfully run on Leetcode : Link not available

// Any problem you faced while coding this : No

  
// Java program to implement 
// a Singly Linked List 
class LinkedList {  //Name of the file has to be same for public class
  
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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
   
          
        if (list.head != null){
            Node temp = list.head;
            while(temp.next != null){ // traverse till the last node
                temp = temp.next;
            }
            temp.next = newNode;    // insert new node in the end
        } else { // If the Linked List is empty, then make the new node as head 
            list.head = newNode;
        }
      
        // Return the list by head 
        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
        Node temp = list.head;
        while(temp != null){ 
            System.out.println(temp.data);  // Print the data at current node 
            temp = temp.next;   // Go to next node
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