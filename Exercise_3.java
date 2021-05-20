// Time Complexity : O(n) as we have to traverse the list everytime to insert at the end.
// Space Complexity : O(n) for list of size n
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

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
        Node(int d) {
            //Write your code here
            this.data = d;
            next = null;
        }
    }

    // Method to insert a new node 
    public static Exercise_3 insert(Exercise_3 list, int data) {
        // Create a new node with given data
        Node newNode = new Node(data);
        Node current = list.head;

        // If the Linked List is empty, then make the new node as head
        // Else traverse till the last node and insert the new_node there
        if (list.head == null) {
            list.head = newNode;
            return list;
        } else{
            while(current.next!=null){
                current = current.next;
            }
        }

        // Insert the new_node at last node
        current.next = newNode;
        // Return the list by head 
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(Exercise_3 list) {
        // Traverse through the LinkedList 

        // Print the data at current node

        // Go to next node
        Node current = list.head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
    }

    // Driver code 
    public static void main(String[] args) {
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