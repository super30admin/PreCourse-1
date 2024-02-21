import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
 class LinkedList {

    // Time Complexity : not sure but seems like O(n^2)
    // Space Complexity : O(n), where "n" is number of elements to be inserted in linkedlist
    // Did this code successfully run on Leetcode : IDK question number
    // Any problem you faced while coding this : No
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) {
            //Write your code here
            this.data = d;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data
        Node n = new Node(data);
        // If the Linked List is empty, 
        // then make the new node as head
        if(list.head == null){
            list.head = n;
            return list;
        }
        Node tempNode = list.head;
        // Else traverse till the last node
        // and insert the new_node there
        while(tempNode != null){
            if(tempNode.next != null){
                tempNode = tempNode.next;
            } else {
                // tempNode == null
                tempNode.next = n;
                return list;
            }
        }
        // Insert the new_node at last node
        // Return the list by head
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) {
        if(list != null && list.head != null){
            Node tempNode = list.head;
            // Traverse through the LinkedList
            while(tempNode != null){
                // Print the data at current node
                System.out.println("Data at node is: " + tempNode.data);
                // Go to next node
                tempNode = tempNode.next;
            }
        }
    } 
   
    // Driver code 
    public static void main(String[] args) {
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