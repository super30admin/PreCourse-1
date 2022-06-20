import java.io.*;

// Insertion time complexity -> O(N)
// Insertion space complexity -> O(1)
// Print time complexity -> O(N)
// Print space complexity -> O(1)
// Problems while writing this code: None
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
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node temp = new Node (data);
        temp.next = null;
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null)
            list.head = temp;
        else {
            Node last_node = list.head;
            while (last_node != null)
                last_node = last_node.next;

            last_node.next = temp;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node temp = list.head;

        System.out.println(temp.data + ", ");
        temp = temp.next;
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