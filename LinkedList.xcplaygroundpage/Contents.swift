// Time complexity O(n)
// Space complexity O(1)

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
    
    func insert(_ node: Node)  {
        node.next = self.head
        self.head = node
    }
    
    func printNodes()  {
        var node = head
        
        while node != nil {
            print(node!.data)
            node = node!.next
        }
        
    }

}

let linkedList = LinkedList.init(Node.init(5))
linkedList.insert(Node.init(10))
linkedList.insert(Node.init(15))
linkedList.insert(Node.init(20))
linkedList.printNodes()
