// Java program to implement
// a Singly Linked List
// Time Complexity : Insert: O(n).
// Space Complexity : O(n) - To store n stack elements.
// Did this code successfully run on Leetcode : Did not find the problem on leetcode.
// Any problem you faced while coding this : No.
class LinkedList {

    static Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            //Write your code here
            this.data = d;
            this.next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data) {
        // Create a new node with given data

        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

        if (head == null) {
            head = new Node(data);
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = new Node(data);
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        // Traverse through the LinkedList

        // Print the data at current node

        // Go to next node
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }

}

class Main_LL{

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);
        list = list.insert(list, 5);

        // Print the LinkedList
        list.printList(list);
    }
}