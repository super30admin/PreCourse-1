// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : -

// Java program to implement
// a Singly Linked List 
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
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node node = new Node(data);

        // If the Linked List is empty,then make the new node as head
        // Else traverse till the last node and insert the new_node there
        if(list.head == null)
            list.head = node;
        else {
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = node;
        }

        // Return the list by head 
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {
        // Traverse through the LinkedList
        Node last = list.head;
        while(last.next != null){
            // Print the data at current node
            System.out.println(last.data);
            // Go to next node
            last = last.next;
        }
        //last node is left out in above while loop
        System.out.println(last.data);
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