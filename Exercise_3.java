// Java program to implement
// a Singly Linked List
/* Time Complexity :
     1. Best case O(1) if the list is empty
     2. Worst case O(n) as we need to travel to end of n elements to insert

    Space Complexity : O(n) // n represents number of elements stored in the stack
     1. Best case O(1) if the list is empty, so 1 element
     2. Worst case O(n) as we will ne storing n elements in the list
 */
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
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        /*
        Scenario 1: if the list is empty, meaning head == null
        so after adding the new node say 6

        6 -> null
        ↑
        head
        */

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null) {
            list.head = newNode;
        }
        /*
         If elements already exists in the list,
         say 4 -> 9 -> 8 -> 1 -> null
             ↑
            head

         we will traverse to find the last element, here it is 1 and then insert 6 at the end
         lastNode is 1
         lastNode.next which is null, we will make it point to newNode 6

         4 -> 9 -> 8 -> 1 -> 6 -> null
         */

        // Else traverse till the last node
        // and insert the new_node there
        else {
            Node lastNode = list.head;

            while(lastNode.next != null) {
                lastNode = lastNode.next;
            }

            // Insert the new_node at last node
            lastNode.next = newNode;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node node = list.head;

        // Traverse through the LinkedList
        while (node != null)
        {
            // Print the data at current node
            System.out.println(node.data);

            // Go to next node
            node = node.next;
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