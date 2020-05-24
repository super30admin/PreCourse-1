
class LinkedList {

	Node head; // head of list

	// Linked list Node.
	// This inner class is made static
	// so that main() can access it
	static class Node {

		int data;
		Node next;

		// Constructor
		Node(int d) {
			this.data = d;
		}
	}

	// Method to insert a new node
	public static LinkedList insert(LinkedList list, int data) {
		// Create a new node with given data
		Node n = new Node(data);
		// If the Linked List is empty,
		// then make the new node as head
		Node tmp = list.head;
		if (tmp == null) {
			System.out.println("Empty list");
			list.head = n;

		} else {
			// Else traverse till the last node
			// and insert the new_node there
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			// Insert the new_node at last node
			tmp.next = n;
		}

		// Return the list by head
		return list;
	}

	// Method to print the LinkedList.
	public static void printList(LinkedList list) {
		// Traverse through the LinkedList
		// Print the data at current node
		// Go to next node
		Node t = list.head;
		while (t != null) {
			System.out.print(t.data + "\t");
			t = t.next;
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
