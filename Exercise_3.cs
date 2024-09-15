using System;

public class SinglyLinkedList
{
    private class Node
    {
        public int Data;
        public Node Next;

        public Node(int data)
        {
            Data = data;
            Next = null;
        }
    }

    private Node head;

    public SinglyLinkedList()
    {
        head = null;
    }

    // Add a node at the end
    public void Add(int value)
    {
        Node newNode = new Node(value);
        if (head == null)
        {
            head = newNode;
        }
        else
        {
            Node current = head;
            while (current.Next != null)
            {
                current = current.Next;
            }
            current.Next = newNode;
        }
    }


    // Print the linked list
    public void PrintList()
    {
        Node current = head;
        while (current != null)
        {
            Console.Write(current.Data + " -> ");
            current = current.Next;
        }
        Console.WriteLine("null");
    }

    public static void Main(string[] args)
    {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add values to the list
        list.Add(1);
        list.Add(2);
        list.Add(3);
        list.Add(4);

        // Print the list
        list.PrintList(); // Output: 1 -> 2 -> 3 -> 4 -> null

    }
}
