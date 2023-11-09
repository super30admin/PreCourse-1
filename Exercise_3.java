// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

  
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
            data = d;
            next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data);

        // new_node.next = head;
        // head = new_node;

        /*
        If the Linked List is empty, 
        then make the new node as head 

            Else traverse till the last node 
            and insert the new_node there 

            Insert the new_node at last node 
        Return the list by head 
        */
        if (list.head == null) {
            list.head = new Node(data);
            return list;
        }

        new_node.next = null;
        Node last = list.head;
        //Traverse to the end
        while (last.next != null) {
            last = last.next;
        }

        //At end, add new node (data)
        last.next = new_node;

        return list;
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        /*
            Traverse through the LinkedList 
            Print the data at current node 
            Go to next node 
        */

        Node tempNode = list.head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;

        }
        System.out.println();
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