// Time Complexity : O(N) - Traverse N number of nodes to add new node at the end
// Space Complexity : O(N) - N number of nodes inserted
// Did this code successfully run on Leetcode : Yes
/*
Any problem you faced while coding this :
Since class 'LinkedList' was declared public, IntelliJ wanted the file name to be the same as the class name.
Hence made the class not public. The other option was to rename the file from 'Exercise_3.java' to 'LinkedList.java'
*/
  
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
            this.data = d;
        } 
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data
        Node newNode = new Node(data);
   
        // If the Linked List is empty, 
        // then make the new node as head
        if (list.head == null) {
            list.head = newNode;
        }
            // Else traverse till the last node 
            // and insert the new_node there
        else {
            Node node = list.head;
            while (node.next != null) {
                node = node.next;
            }
            // Insert the new_node at last node
            node.next = newNode;
        }
        // Return the list by head
        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList
        Node node = list.head;
        while (node != null) {

            // Print the data at current node
            System.out.println(node.data);

            // Go to next node
            node = node.next;
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