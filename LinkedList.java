// Java program to implement
// a Singly Linked List
//Time complexity is same for both operations O(n) as we are searching for last element and placing it at end
// Space Complexity is O(1)
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
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node temp = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null){
            list.head = temp;
        }else {
            // Else traverse till the last node
            // and insert the new_node there

            // Insert the new_node at last node
            Node new_node = list.head;
            while (new_node.next != null){
                new_node = new_node.next;
            }
            new_node.next = temp;
        }


        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        // Traverse through the LinkedList

        Node current = list.head;

        while (current != null) {
            // Print the data at the current node
            System.out.print(current.data + " ");

            // Go to the next node
            current = current.next;
        }
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