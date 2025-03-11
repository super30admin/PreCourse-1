package s30.preCourse1;

// Java program to implement
// a Singly Linked List
public class Exercise3 {

    static Node head; // head of list

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
    public static Exercise3 insert(Exercise3 list, int data)
    {
        // Create a new node with given data

        if(list.head == null) {
            list.head = new Node(data);
        } else {
            Node runner = list.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = new Node(data);
        }
        return list;
        // If the Linked List is empty,
        // then make the new node as head

        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

    }

    // Method to print the LinkedList.
    public static void printList(Exercise3 list)
    {
        // Traverse through the LinkedList
        // Print the data at current node
        // Go to next node
        Node runner = list.head;
        while(runner != null) {
            System.out.println(runner.data);
            runner = runner.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        Exercise3 list = new Exercise3();

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
