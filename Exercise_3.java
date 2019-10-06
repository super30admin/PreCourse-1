/*
Author: Akhilesh Borgaonkar
Problem: Java program to implement a Singly Linked List.
Approach: Implemented singly LinkedList using next Node in the LinkedList Node object.
Time complexity: insert(), printList() - O(n) where n is number of nodes currently in the LinkedList.
Space complexity: O(n) where n is number of nodes currently in the LinkedList.
Verified functionality on local machine.
*/

public class Exercise_3 {

    public static class LinkedList {

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
                this.next = null;
            }
        }

        // Method to insert a new node
        public static LinkedList insert(LinkedList list, int data)
        {
            // Create a new node with given data
            Node temp = new Node(data);

            // If the Linked List is empty,
            // then make the new node as head
            if(list.head==null){
                list.head = temp;
            }

            // Else traverse till the last node
            // and insert the new_node there
            else {
                Node current = list.head;
                while (current.next!=null)
                    current = current.next;

                // Insert the new_node at last node
                current.next = temp;
            }

            // Return the list by head
            return list;
        }

        // Method to print the LinkedList.
        public static void printList(LinkedList list)
        {
            if(list.head!=null){
                Node current = list.head;
                System.out.println(current.data);

                // Traverse through the LinkedList
                while (current.next!=null) {
                    current = current.next;             // Go to next node
                    System.out.println(current.data);   // Print the data at current node
                }

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
}
