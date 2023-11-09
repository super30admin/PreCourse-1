// Time Complexity : Insert(Push) - O(n), Delete(Pop) - O(1),
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Did not found problem
// Any problem you faced while coding this : no


// Java program to implement
// a Singly Linked List
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
            //Write your code here
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node node = new Node(data);
        node.next = null;
        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null)
        {
            list.head = node;
        }
        else {
            Node Temp = list.head;
            while (Temp.next!=null)
            {
                Temp = Temp.next;
            }
            Temp.next = node;
        }
            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList
        Node node = list.head;
        // Print the data at current node
            while(node!=null)
            {
                System.out.println(node.data);
                node=node.next;
            }
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