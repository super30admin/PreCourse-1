// JavaScript program to implement
// a Singly Linked List
// Time Complexity : O(n)
// Space Complexity : O(1)
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
    const new_node = new LinkedList.Node(data);

    // If the Linked List is empty,
    // then make the new node as head
    if (list.head == null) {
      list.head = new_node;
    } else {
      // Else traverse till the last node
      // and insert the new_node there
      let last = list.head;
      while (last.next != null) {
        last = last.next;
      }
      // Insert the new_node at last node
      last.next = new_node;
    }
    // Return the list by head
    return list;
  }

  // Method to print the LinkedList.
  printList(list) {
    // Traverse through the LinkedList
    let curr = list.head;
    while (curr != null) {
      console.log(curr.data + " ");
      curr = curr.next;
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
