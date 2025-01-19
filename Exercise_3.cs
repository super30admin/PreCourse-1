// Time Complexity :  O(N) where N is number of nodes in list
// Space Complexity : O(N) where N is number of nodes in list
using System;

public class LinkedList
{

    Node head; // head of list 

    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    public class Node
    {

        public int data;
        public Node next;

        // Constructor 
        public Node(int d)
        {
            //Write your code here 
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data 
        Node NewNode = new Node(data);


        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null)
        {
            list.head = NewNode;
        }
        // Else traverse till the last node 
        // and insert the new_node there 
        else
        {
            Node node1 = list.head;
            while (node1.next != null)
            {
                node1 = node1.next;
            }
            // Insert the new_node at last node 
            node1.next = NewNode;
        }
        // Return the list by head 
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList 
        Node node1 = list.head;
        while (node1.next != null)
        {
            // Print the data at current node 
            Console.Write(node1.data + " ");
            // Go to next node 
            node1 = node1.next;
        }
        Console.WriteLine(node1.data);
    }

    // Driver code
    public static void Main(string[] args)
    {
        // Start with the empty list
        LinkedList list = new LinkedList();

        // Insert values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        // Print the LinkedList
        printList(list);
    }
}




