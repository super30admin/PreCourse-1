// a Singly Linked List
class LinkedList {
  constructor() {
    this.startPos = null;
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
    let newNode = new LinkedList.Node(data);

    if (list.startPos === null) {
      list.startPos = newNode;
    } else {
      let lastPos = list.startPos;
      while (lastPos.next !== null) {
        lastPos = lastPos.next;
      }
      lastPos.next = newNode;
    }

    return list;
  }

  // Method to print the LinkedList.
  printList(list) {
    let currNode = list.startPos;

    let output = "";
    while (currNode !== null) {
      output += currNode.data + " ";
      currNode = currNode.next;
    }
    console.log(output.trim());

    // Traverse through the LinkedList
    // Print the data at current node
    // Go to next node
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
