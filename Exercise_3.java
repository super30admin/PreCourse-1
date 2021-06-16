

// Java program to implement
// a Singly Linked List
// Time Complexity : O(n) to insert
// Space Complexity : O(n) -> n is the number nodes in the list
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this : No
class LinkedList {

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
            this.data = d;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);

        if(list.head == null) {
            list.head = newNode;
        } else {
            Node tempNode = list.head;
            while(tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currentHead = list.head;
        while(currentHead != null) {
            System.out.println("Linkedlist Node " +currentHead.data);
            currentHead = currentHead.next;
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