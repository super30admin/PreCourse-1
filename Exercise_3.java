import LinkedList.Node;

// Java program to implement
// a Singly Linked List
public class LinkedList
{

	Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node
	{

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
		Node newNode = new Node(data);

		if (list.head == null)
		{
			list.head = newNode;
		}
		else
		{
			Node lastNode = list.head;
			while (lastNode.next != null)
			{
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
		}
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedList list)
	{
		// Traverse through the LinkedList
		Node printNode = list.head;

		while (printNode != null)
		{
			System.out.println(printNode.data);
			printNode = printNode.next;
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