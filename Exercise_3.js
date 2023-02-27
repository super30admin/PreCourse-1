class Node {
  constructor(value, next=null) {
    this.value = value
    this.next = next
  }
}

class SinglyLinkedList {
  constructor() {
    this.head = null
    this.tail = null
    this.size = 0
  }

  append(value) {
    const node = new Node(value)

    if (!this.head) {
      this.head = node
      this.tail = node
    } else {
      this.tail.next = node
      this.tail = node
    }

    this.size++
  }

  find(value) {
    let currentNode = this.head

    while(currentNode) {
      if (currentNode.value === value) return currentNode
      currentNode = currentNode.next
    }
    return null
  }

  remove(value) {
    if (!this.head) return null

    // if value is head
    if (this.head.value === value) {
      this.head = this.head.next

      if (this.size === 1) {
        this.tail = null
      }
      this.size--
      return true
    }

    let currentNode = this.head

    while (currentNode.next) {
      if (currentNode.next.value === value) {
        // updates tail if removed value is the last node
        if (currentNode.next === this.tail) {
          this.tail = currentNode
        }

        currentNode.next = currentNode.next.next
        this.size--
        return true
      }

      currentNode = currentNode.next
    }

    return false
  }
}