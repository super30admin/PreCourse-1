// Time Complexity : append= O(1), find, remove = O(N)
// Space Complexity : O(1)
class ListNode {
  constructor(data = null, next = null) {
    this.data = data;
    this.next = next;
  }
}

class SinglyLinkedList {
  constructor() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }
  append(data) {
    let newNode = new ListNode(data);
    if (!this.head) {
      this.head = newNode;
      this.tail = this.head;
    } else {
      this.tail.next = newNode;
      this.tail = this.tail.next;
    }
    this.length += 1;
    return this;
  }

  find(key) {
    if (!key) return false;
    let i = 0;
    let currentNode = this.head;
    while (i <= this.length) {
      console.log(currentNode, key);
      if (currentNode.data === key) {
        return true;
      } else if (currentNode.next) {
        currentNode = currentNode.next;
      }
      i++;
    }
    return false;
  }

  remove(key) {
    let i = 0;
    let currentNode = this.head;
    let prevNode = this.head;
    while (i <= this.length) {
      if (currentNode.data === key) {
        if (this.length === 1) {
          this.head = this.tail = null;
          this.length -= 1;
          return this;
        }
        if (currentNode === this.head) {
          this.head = currentNode.next;
        } else if (currentNode === this.tail) {
          this.tail = prevNode;
          this.tail.next = null;
        } else {
          prevNode.next = currentNode.next;
        }
        this.length -= 1;
        return this;
      } else if (currentNode.next) {
        prevNode = currentNode;
        currentNode = currentNode.next;
      }
      i++;
    }
    return this;
  }
}

let linked_list = new SinglyLinkedList();
linked_list.append("Item1");
linked_list.append("Item2");
linked_list.append("Item3");
console.log(linked_list);
// console.log(linked_list.find("Item"));
linked_list.remove("Item2");
//console.log(linked_list);
linked_list.remove("Item3");
console.log(linked_list);
linked_list.remove("Item1");
console.log(linked_list);
