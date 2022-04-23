using System;
namespace Algorithms
{
    // a Singly Linked List 
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
                next = null;
            }
        }

        // Method to insert a new node 
        public  LinkedList insert(LinkedList list, int data)
        {
            // Create a new node with given data
            Node newNode = new Node(data);

            // If the Linked List is empty, 
            // then make the new node as head
            if(list.head == null)
            {
                list.head = new Node(data);
                return list;
            }

            newNode.next = null;
            // Else traverse till the last node
            // and insert the new_node there 

            Node last = list.head;
            while (last.next != null)
                last = last.next;

            // Insert the new_node at last node
            last.next = newNode;
            // Return the list by head
            return list;

        }

        // Method to print the LinkedList. 
        public void printList(LinkedList list)
        {
            Node temp = list.head;
            while (temp != null)
            {
                Console.WriteLine(temp.data);
                temp = temp.next;
            }           
        }

    }
}
