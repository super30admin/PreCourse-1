

class LinkedList {
    constructor(head = null) {
      this.head = head;
      this.size = 0;
    }
  
    // Time Complexity : O(1)
// Space Complexity : O(1)
    insert(data) {
      let newNode = new Node(data);
      if (this.head == null) this.head = newNode;
      else {
        let tempNode = this.head;
        while (tempNode.next) {
          tempNode = tempNode.next;
        }
        tempNode.next = newNode;
      }
      this.size++;
    }
  
    // Time Complexity : O(1)
// Space Complexity : O(1)
    printList() {
      let tempNode = this.head;
      while (tempNode.next) {
        console.log(tempNode.data);
        tempNode = tempNode.next;
      }
    }
  }
  
  class Node {
    constructor(data, next = null) {
      this.data = data,
        this.nextNode = next;
    }
  }
  
  
  
  let linkedList = new LinkedList();
  linkedList.insert(1);
  linkedList.insert(2);
  linkedList.insert(3);
  linkedList.insert(4);
  linkedList.insert(5);
  
  linkedList.printList();
