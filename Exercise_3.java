// Time Complexity :
//   insert() at end -> O(n) because we may traverse the whole list to reach the last node
//   printList()     -> O(n) to visit each node once
// Space Complexity : O(n) for n nodes (each node stores data + next reference)
// Any problem you faced while coding this :
//   - Java rule: if class is public, filename must match class name. Use 'class LinkedList' (no public) in Exercise_3.java
//     or rename file to LinkedList.java if making it public.
//   - Remember to return the updated list at the end of insert().
//   - Remember to declare and advance 'currNode' in printList().
// Your code here along with comments explaining your approach
//   - We define a Node with data and next. The list holds a head pointer.
//   - insert: if head is null, new node becomes head. Otherwise, walk to the end and link the new node.
//   - printList: start at head and print each node's data until we reach null.
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
    public static LinkedList insert(LinkedList list, int data){ 
        // Create a new node with given data
        Node newNode = new Node(data);
         
        // If the Linked List is empty, 
        // then make the new node as head
        if(list.head == null){
            list.head = newNode;
        } else{
            Node last = list.head;
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = newNode;
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
        Node currNode = list.head;
        // Traverse through the LinkedList
        while (currNode != null) { 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        }
        System.out.println();  
   
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