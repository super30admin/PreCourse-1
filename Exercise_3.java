//Java program to implement 
//a Singly Linked List 
public class Exercise_3 {
	Node head; // head of list
	// Linked list Node.
	// This inner class is made static
	// so that main() can access it

	static class Node {

		int data;
		Node next;

		Node() {

		}

		// Constructor
		Node(int data) {
			// Write your code here
			this.data = data;
			this.next = null;
		}
	}

	// Method to insert a new node

	public static Node insert(Node list, int data) {
		Node temp, p;
		temp = new Node(data);
		temp.data = data;
		if (list == null) {
			list = temp;
		} else {
			p = list;
			while (p.next != null) {
				p = p.next;
			}
			p.next = temp;
		}
		return list;

	}

	// Method to print the LinkedList.
	public static void printList(Node list) {
		// Traverse through the LinkedList
		Node curr = list;
		while (curr.next != null) {
			curr = curr.next;
			System.out.println("Node Data = " + curr.data);
		}
	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		// Node list = new Node();
		Node curr = new Node();
		//
		// ******INSERTION******
		//

		// Insert the values
		insert(curr, 1);
		insert(curr, 2);
		insert(curr, 3);
		insert(curr, 4);
		insert(curr, 5);
		// Print the LinkedList
		printList(curr);
	}
}

// time Complexity 
// Inserting: O(1), if done at the head, O(n) if anywhere else since we have to reach that position by traveseing the linkedlist linearly.
// Deleting: O(1), if done at the head, O(n) if anywhere else since we have to reach that position by traveseing the linkedlist linearly.
// Searching: O(n)
