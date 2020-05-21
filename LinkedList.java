import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList {

    static Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            // Write your code here
            this.data = data;
        }
    }

   public Node insert(LinkedList list, int data) {
		// Create a new node with given data

		// If the Linked List is empty,
		// then make the new node as head

		// Else traverse till the last node
		// and insert the new_node there

		// Insert the new_node at last node
		// Return the list by head
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
				temp.next = newNode;
			}

		}
		return newNode;
	}

    // Method to print the LinkedList.
    public void printList(Node n) {
		// Traverse through the LinkedList

		// Print the data at current node

		// Go to next node
		if(null == head) {
			System.out.println("No node created");
			
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		
	}

    // Driver code
    public static void main(String[] args) {
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