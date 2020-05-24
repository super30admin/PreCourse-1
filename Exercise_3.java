import java.io.*;

// Java program to implement
// a Singly Linked List
public class Exercise_3 {

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
            next=null;

        }
    }

    // Method to insert a new node
    public static Exercise_3 insert(Exercise_3 list, int data)

    {
        // Create a new node with given data
        Node new_node = new Node(data);
        if(list.head == null){
            // If the Linked List is empty,
            // then make the new node as head
            list.head = new_node;
        }
        else{
            // Else traverse till the lastElement node
            // and insert the new_node there

            Node lastElement = list.head;
            while(lastElement.next!=null){
                lastElement = lastElement.next;
            }
            // Insert the new_node at last node
            lastElement.next=new_node;

        }
        // Return the list by head
        return list;

    }

    // Method to print the LinkedList.
    public static void printList(Exercise_3 list)
    {
        Node stackElements =list.head;
        // Traverse through the LinkedList
        while(stackElements.next!=null){
            // Print the data at current node
            System.out.println(stackElements.data);
            // Go to next node
            stackElements= stackElements.next;
        }


    }

    // Driver code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        Exercise_3  list = new Exercise_3();

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
//TimeComplexity O(n)