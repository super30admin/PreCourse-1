// Time Complexity : insert and print O(n)
// Space Complexity : O(1) since we not creating any data structure in user facing functions.
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : NO

// Java program to implement
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
  insert(data) {
    // Create a new node with given data
    // If the Linked List is empty,
    // then make the new node as head
    // Else traverse till the last node
    // and insert the new_node there
    // Insert the new_node at last node
    // Return the list by head
    let newNode = new LinkedList.Node(data);
    if (this.isEmpty() == true) {
      this.head = newNode;
    } else {
      let last_node = this.traverseToLastNodeFromNode(this.head);
      last_node.next = newNode;
    }
  }

  // Method to print the LinkedList.
  printList() {
    // Traverse through the LinkedList
    // Print the data at current node
    // Go to next node
    let currentNode = this.head;
    while (currentNode != null) {
      currentNode = currentNode.next;
    }
  }

  isEmpty() {
    return this.head === null;
  }

  traverseToLastNodeFromNode(node) {
    if (node.next != null) {
      return this.traverseToLastNodeFromNode(node.next);
    }
    return node;
  }
}
// Driver code
/* Start with the empty list. */
let list = new LinkedList();

// ******INSERTION******
// Insert the values
list.insert(1);
list.insert(2);
list.insert(3);
list.insert(4);
// Print the LinkedList
list.printList();

test("Scenario #1:", () => {
  let obj = new LinkedList();
  obj.insert(10);
  obj.insert(20);
  obj.insert(30);
  expect(obj.printList()).toBeUndefined();
});
