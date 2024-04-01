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
		Node node;

		public Node() {
		}

		// Constructor
		public Node(int d) {
			node = new Node();
			node.data = d;
		}
	}

	// Method to insert a new node
	public static Exercise_3 insert(Exercise_3 list, int data) {
        Node newNode = new Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
	}

	// Method to print the LinkedList.
	public static void printList(Exercise_3 list) {
		Node tmp = list.head;
		while (tmp != null) {
			System.out.println(tmp.node.data);
			tmp = tmp.next;
		}
	}

	// Driver code
	public static void main(String[] args) {
		/* Start with the empty list. */
		Exercise_3 list = new Exercise_3();

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