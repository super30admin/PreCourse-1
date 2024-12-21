using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PreCourse_1
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
            data = d;
        }
    }
    //Time Complexity: O(n)
    //Space Complexity: O(n) where n is total number of elements
    internal class LinkedList
    {
        Node head; // head of list 

        // Method to insert a new node 
        public LinkedList Insert(LinkedList list, int data)
        {
            // Create a new node with given data
            var node = new Node(data);

            // If the Linked List is empty, 
            // then make the new node as head 
            if (list == null || list.head == null)
            {
                list = new LinkedList();
                list.head = node;
                return list;
            }

            // Else traverse till the last node 
            // and insert the new_node there 
            var current = list.head;
            while (current.next != null)
            {
                current = current.next;
            }
            // Insert the new_node at last node 
            current.next = node;
            // Return the list by head 
            return list;
        }

        // Method to print the LinkedList. 
        public void printList(LinkedList list)
        {
            var current = list.head;
            // Traverse through the LinkedList 
            while (current != null)
            {
                // Print the data at current node 
                Console.WriteLine($"Node data is {current.data}");
                // Go to next node
                current = current.next;
            }
        }
    }
    static void Main(string[] args)
        {
            LinkedList list = new LinkedList();

            // Insert the values 
            list = list.Insert(list, 1);
            list = list.Insert(list, 2);
            list = list.Insert(list, 3);
            list = list.Insert(list, 4);
            list = list.Insert(list, 5);

            // Print the LinkedList 
            list.printList(list);
            Console.ReadKey();
        }
    }
