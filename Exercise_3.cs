public class LinkedList
{
    public Node head; // head of list 

    // Time Complexity : O(n) as we are traversing the list and adding in the end
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode :
    // Any problem you faced while coding this : No problems as such but needed to refresh my knowledge on Linked list

    // Linked list Node. 

    public class Node
    {

        public int data;
        public Node next;

        // Constructor 
        public Node(int d)
        {
            //Write your code here
            data = d;
        }
    }

    // Method to insert a new node 
    public LinkedList Insert(LinkedList list, int data)
    {
        // Create a new node with given data     

        // If the Linked List is empty, 
        // then make the new node as head 

        // Else traverse till the last node 
        // and insert the new_node there

        // Insert the new_node at last node 
        // Return the list by head 


        Node newNode = new Node(data);

        if (list.head == null)
            list.head = newNode;
        else
        {
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    // Method to print the LinkedList. 
    public void PrintList(LinkedList list)
    {
        // Traverse through the LinkedList 
        // Print the data at current node 
        // Go to next node 

        Node current = list.head;
        while (current != null)
        {
            Console.WriteLine(current.data);
            current = current.next;
        }

    }
}

// Driver code 
public class Program
{
    public static void Main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // 
        // ******INSERTION****** 
        // 

        // Insert the values 
        list = list.Insert(list, 1);
        list = list.Insert(list, 2);
        list = list.Insert(list, 3);
        list = list.Insert(list, 4);
        list = list.Insert(list, 5);

        // Print the LinkedList 
        list.PrintList(list);
    }
}
