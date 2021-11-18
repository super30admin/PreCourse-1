// Time Complexity:
// Append: O(n)
// insertAt: O(n)
// removeFrom: O(n)
// printList: O(n)

// Space Complexity:
// Append: O(1)
// insertAt: O(1)
// removeFrom: O(1)
// printList: O(1)

// Did this code successfully run on Leetcode: N/A
// Any problem you faced while coding this: Yes. I have trouble wrapping my mind around the currentNode.next concept

class Node {
  constructor(data, next = null) {
    this.data = data;
    this.next = next;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
    this.size = 0;
  }

  append(value) {
    const newNode = new Node(value);
    let currentNode;
    if (!this.head) {
      this.head = newNode;
      this.size++;
    } else {
      currentNode = this.head;
      while (currentNode.next) {
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
      this.size++;
    }
  }

  insertAt(value, index) {
    const newNode = new Node(value);
    if (index >= this.size) {
      return console.log("please provide a valid index");
    } else if (index === 0) {
      newNode.next = this.head.next;
      this.head = newNode;
    } else {
      let iterator = 0;
      let currentNode = this.head;
      let prevNode;
      while (iterator < index) {
        if (currentNode.next) {
          iterator++;
          prevNode = currentNode;
          currentNode = currentNode.next;
        }
      }
      newNode.next = currentNode.next;
      prevNode.next = newNode;
    }
  }

  removeFrom(index) {
    let tempVariable;
    if (!this.head) {
      return console.log("the list is empty");
    }

    if (index >= this.size) {
      return console.log("please provide a valid index");
    }

    let currentElement = this.head;
    let previousElement;
    let iterator = 0;

    if (index === 0) {
      tempVariable = this.head.data;
      this.head = this.head.next;
      this.size--;
      return console.log("removed element:", tempVariable);
    } else {
      while (iterator < index) {
        if (currentElement.next) previousElement = currentElement;
        currentElement = currentElement.next;
        tempVariable = currentElement.data;
        iterator++;
      }
      this.size--;
      console.log("this is the removed element:", tempVariable);
      return (previousElement.next = currentElement.next);
    }
  }

  printList() {
    let currentElement = this.head;
    while (currentElement) {
      console.log(currentElement.data);
      currentElement = currentElement.next;
    }
  }
}

const currentList = new LinkedList();
// appends to list
currentList.append(10);
currentList.append(20);
currentList.append(30);
currentList.append(40);

// inserts at index in list
currentList.insertAt(15, 1);

// prints list
currentList.printList();

// removes from specified index
currentList.removeFrom(2);
currentList.removeFrom(2);
currentList.removeFrom(2);
console.dir(currentList, { depth: null });
