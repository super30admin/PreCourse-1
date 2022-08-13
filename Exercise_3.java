/*

 * Approach - start with dummy node head and maintain length variable. 
 * Add node pointin to previous.next
 * 
 * Time - O(n)  -- traversal through the list for insertion and printing
 * Space- O(n) -- n nodes- n space
*/

import java.io.*; 
  
public class LinkedList {

    Node head; // head of list
    int length;

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

    //constructor intializer
    LinkedList()
    {
        head = new Node(-1); //intiazlizing with Dummy data
        length = 0; //keep track of nodes/length
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

        Node newNode = new Node(data);
        //check if length ==0; make node as head
        if(list.length ==0)
        {
            list.head = newNode;
        }
        //else traverse through the end and add there
        else
        {
            Node curr = list.traverseThroughLL(list);
            curr.next = newNode;
        }
        list.length++;
        return list;
    }

    public Node traverseThroughLL(LinkedList list)
    {
        Node curr = list.head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        return  curr;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node curr = list.head;
        // Traverse through the LinkedList
        while (curr.next != null && list.length !=0)
        {
            // Print the data at current node
            System.out.println(curr.data);
            // Go to next node
            curr = curr.next;
        }
        System.out.println(curr.data);
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