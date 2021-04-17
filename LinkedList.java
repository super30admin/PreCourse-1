import java.io.*;

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
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null) {
            list.head = newNode;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node end = list.head;
            while(end.next != null) {
                end = end.next;
            }
            // Insert the new_node at last node
            end.next = newNode;
        }
        // Return the list by head
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        Node currentNode = list.head;
        System.out.println("LinkedList: ");
        // Traverse through the LinkedList
        while(currentNode != null) {
            // Print the data at current node
            System.out.println(currentNode.data+ " ");
            // Go to next node
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Method to delete a node by position
    public static LinkedList deleteByPosition(LinkedList list, int position) {
        // Head Node
        Node currentNode = list.head, previousNode = null;
        // If position is 0, in that case head node has to be deleted
        if(position == 0 && currentNode != null) {
            list.head = currentNode.next;
            System.out.println("The element at position "+ position + " is deleted");
            return list;
        }
        // If position is less than the size of LinkedList but greater than 0
        int counter = 0;
        // Keeping the count for the position to be deleted, and keeping track of previous node
        // since it is required to be changed currentNode,next
        while(currentNode != null) {
            if (counter == position) {
                // As the currentNode is needed, position unlink currentNode from LinkedList
                previousNode.next = currentNode.next;
                System.out.println("The element at position " + position + " is deleted");
                break;
            } else {
                // In case current position is not the index continue to next node
                previousNode = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }
            // If the position element was found, it has to be at currentNode therefore the currentNode should not be null
            // If index is greater than size of LinkedList
            if(currentNode == null) {
                System.out.println("The element at position "+ position + " not found");
            }
            return list;
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

        deleteByPosition(list,0);

        printList(list);

        deleteByPosition(list,3);

        printList(list);

        deleteByPosition(list, 11);

        printList(list);

    }
}