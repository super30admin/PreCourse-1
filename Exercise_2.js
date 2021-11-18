// Time Complexity:
// push: O(1)
// pop: O(1)
// peek: O(1)
// isEmpty: O(1)

// Space Complexity:
// push: O(1)
// pop: O(1)
// peek: O(1)
// isEmpty: O(1)

class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
  }

  push(value) {
    const currentNode = new Node(value);
    // if list is empty(null) we set head to the current node
    if (!this.head) {
      return (this.head = currentNode);
    }
    currentNode.next = this.head;
    return (this.head = currentNode);
  }

  pop() {
    if (!this.head) {
      return console.log("Stack Underflow");
    }
    const poppedElement = this.head.data;
    this.head = this.head.next;
    return console.log("poppedElement:", poppedElement);
  }

  peek() {
    if (!this.head) {
      return console.log("Stack Underflow");
    }
    const peekedElement = this.head.data;
    return console.log("peekedElement:", peekedElement);
  }

  isEmpty() {
    if (!this.head) {
      return console.log("True: stack is empty");
    }
    return console.log("False: stack is NOT empty");
  }
}

const currentList = new LinkedList();

// Checks to see if list is empty - returns true
currentList.isEmpty();

// Pushes element to the top of the stack
currentList.push(10);
currentList.push(20);
currentList.push(30);
console.dir(currentList, { depth: null });

// Removes top most element and returns it
currentList.pop();

// Returns top most element without removing it
currentList.peek();

// Checks to see if list is empty - returns false
currentList.isEmpty();
console.dir(currentList, { depth: null });
