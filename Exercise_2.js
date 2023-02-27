class Node {
  constructor(value, next=null) {
    this.value = value
    this.next = next
  }
}

class Stack {
  constructor() {
    this.head = null
    this.size = 0
  }

  push(value) {
    const node = new Node(value, this.head)
    this.head = node
    this.size++
  }

  pop() {
    if (!this.head) return null

    this.head = this.head.next
    this.size--
  }

  size() {
    return this.size
  }

  peek() {
    return this.head ? this.head.value : null
  }

  isEmpty() {
    return this.size === 0
  }
}