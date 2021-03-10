// Time Complexity : O(N) Where N is the number of nodes in the Linkedlist
// Space Complexity : O(N) Where N is the number of nodes in the Linkedlist
// Did this code successfully run on Leetcode : Not on Leetcode
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
import java.io.*; 
  
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
            //Write your code here
        }
    }
    //Initialize LinkedList head to null
    public LinkedList(){
        this.head = null;
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {

        // Create a new node with given data
        Node node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        // Else traverse till the last node
        // and insert the new_node there
        if(list.head == null) {
            list.head = node;
        }else{
            Node currNode = list.head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = node;
        }

        
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        while(currNode != null){
            System.out.println(currNode.data);
            currNode = currNode.next;
        }

        // Traverse through the LinkedList

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

