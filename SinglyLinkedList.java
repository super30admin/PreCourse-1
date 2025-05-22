// Time Complexity :
// insert() - O(n), where n is the number of nodes in the list (due to traversal)
// printList() - O(n)
// isEmpty() - O(1)
//
// Space Complexity :
// O(n), where n is the number of nodes created
//
// Did this code successfully run on Leetcode :
// No - This is a utility/implementation code for practice, not a LeetCode submission.
//
// Any problem you faced while coding this :
// No

// Your code here along with comments explaining your approach:
// This Java class implements a basic singly linked list.
// - Each node contains an integer value and a reference to the next node.
// - `insert()` method appends new nodes at the end of the list.
// - `printList()` prints all the elements from head to tail.
// - `isEmpty()` checks whether the list is empty (i.e., head is null).

// a Singly Linked List 
public class SinglyLinkedList { 
  
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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static SinglyLinkedList insert(SinglyLinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node newNode = new Node(data);
       
        // If the Linked List is empty, 
        // then make the new node as head 
        if(list.head == null){
            list.head = newNode;
        } else {
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            // Insert the new_node at last node 
            last.next = newNode;
        }
        
        // Return the list by head 
        return list;
    } 

    // Method to print the LinkedList. 
    public static void printList(SinglyLinkedList list) 
    { 
        Node currNode = list.head; 
        // Traverse through the LinkedList 
        while(currNode != null){
            // Print the data at current node 
            System.out.print(currNode.data + " ");
            // Go to next node 
            currNode = currNode.next;
        }
        System.out.println();
   } 

   public boolean isEmpty() {
        return head == null;
    }
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        SinglyLinkedList list = new SinglyLinkedList(); 
  
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

        // Check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());
    } 
}