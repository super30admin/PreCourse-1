using System;

/*
OUTPUT:
1
2
3
4
5

Method      Time complexity     
insert          O(n)      
printList       O(n)               

Space complexity: O(n)
*/

namespace Precourse1
{
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
        }
    }
    // Java program to implement 
    // a Singly Linked List 
    public class LinkedList
    {

        public Node head; // head of list 

        

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

            Node node = new Node(data);
            if(list.head==null)
            {
                list.head = node;
            }
            else
            {
                Node temp = list.head;
                while(temp.next!=null)
                {
                    temp = temp.next;
                }
                temp.next = node;
            }
            return list;
        }

        // Method to print the LinkedList. 
        public static void printList(LinkedList list)
        {
            // Traverse through the LinkedList 

            // Print the data at current node 

            // Go to next node
            Node node = list.head;
            while(node!=null)
            {
                Console.WriteLine(node.data.ToString());
                node = node.next;
            }
        }

        // Driver code 
        public static void Main(String[] args)
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