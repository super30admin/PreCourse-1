// Insert
//  Time complexity: O(N)
//  Space complexity: O(N) - N being size of the LinkedList (stored elements)
// PrintList
//  Time complexity: O(N) - N being size of LinekdList (stored elements)
// a Singly Linked List
class LinkedList {
	constructor() {
		this.head = null;
	}
	// Linked list Node.
	static Node = class {
		constructor(d) {
			this.data = d;
			this.next = null;
		}
	};

	// Method to insert a new node
	insert(list, data) {
		// Create a new node with given data
		const newNode = new LinkedList.Node(data);
		// If the Linked List is empty,
		// then make the new node as head
		// Else traverse till the last node
		// and insert the new_node there
		// Insert the new_node at last node
		// Return the list by head

		if (list.head === null) {
			list.head = newNode;
		} else {
			let last = list.head;
			while (last.next !== null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}

	// Method to print the LinkedList.
	printList(list) {
		// Traverse through the LinkedList
		// Print the data at current node
		// Go to next node
		let current = list.head;

		while (current !== null) {
			console.log(`${current.data}`);
			current = current.next;
		}
	}
}
// Driver code
/* Start with the empty list. */
let list = new LinkedList();

// ******INSERTION******
// Insert the values
list.insert(list, 1);
list.insert(list, 2);
list.insert(list, 3);
list.insert(list, 4);
// Print the LinkedList
list.printList(list);
