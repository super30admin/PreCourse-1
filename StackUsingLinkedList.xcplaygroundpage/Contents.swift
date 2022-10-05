// Time complexity O(n)
// Space complexity O(1)
// Got reference from https://www.raywenderlich.com/947-swift-algorithm-club-swift-linked-list-data-structure#toc-anchor-008

import Darwin

class Node {
    var data: Int
    var next: Node?
    
    init(_ value: Int) {
        self.data = value
    }
}

class LinkedList {
    var head: Node?
    var tail: Node?
    
    init(_ node: Node) {
        head = node
        tail = nil
    }
    
    func addAtFront(_ node: Node)  {
        node.next = self.head
        self.head = node
    }
    
    func removeFromFront() {
        head = head?.next
    }
    
    
}

extension LinkedList: CustomStringConvertible {
  // 2
  public var description: String {
    // 3
    var text = "["
    var node = head
    // 4
    while node != nil {
      text += "\(node!.data)"
      node = node!.next
      if node != nil { text += ", " }
    }
    // 5
    return text + "]"
  }
}

class Stack {
    fileprivate var linkedList: LinkedList
    
    init(_ value: Int) {
        let node = Node.init(value)
        linkedList = LinkedList.init(node)
    }
    
    func push(_ value: Int)  {
        linkedList.addAtFront(Node.init(value))
    }
    
    func pop()  {
        linkedList.removeFromFront()
    }
    
    func peep() {
        print(linkedList.head?.data ?? "Stack is empty")
    }
    
    func isEmpty() -> Bool {
        if linkedList.head == nil {
            return true
        }
        return false
    }
    
    func printValues()  {
        print(linkedList)
    }
}

var myStack = Stack(10)
myStack.isEmpty()
myStack.peep()
myStack.push(20)
myStack.peep()
myStack.push(30)
myStack.peep()
myStack.printValues()
myStack.pop()
myStack.peep()
myStack.printValues()
myStack.pop()
myStack.pop()
myStack.isEmpty()

