using System;

public class LinkedList
{

    public Node head; // head of list 

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
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data 
        Node node = new Node(data);

        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null)
        {
            list.head = node;
        }
        else
        {
            // Else traverse till the last node 
            // and insert the new_node there
            Node temp = list.head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            // and insert the new_node there
            // Insert the new_node at last node 
            temp.next = node;
        }
        // Return the list by head 
        return list;

    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList 
        // Print the data at current node 
        // Go to next node 
        Node temp = list.head;
        while (temp.next != null)
        {
            Console.WriteLine(temp.data);
            temp = temp.next;
        }


    }
    class Program
    {
        // Driver code 
        static void Main(String[] args)
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
}