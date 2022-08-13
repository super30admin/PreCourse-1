import Cocoa


// Time Complexity - O(n)
// Space Complexity - O(n)

class StackNode<T> {
    let value: T
    var next: StackNode<T>?
    
    init(value: T, next: StackNode<T>? = nil) {
        self.value = value
        self.next = next
    }
}

class Stack<T> {
    var top: StackNode<T>?
    
    var isEmpty: Bool {
        return top == nil
    }
    
    func push(newValue: T) {
        let newStackNode = StackNode(value: newValue)
        
        newStackNode.next = top
        top = newStackNode
    }
    
    func pop() -> T? {
        
        guard let topNode = top else {
            return nil
        }
        
        let newReturnNode = topNode
        self.top = topNode.next
        return newReturnNode.value
    }
    
    func peek() -> T? {
        return top?.value
    }
    
}

extension StackNode: CustomStringConvertible {
    var description: String {
        guard let next = next else {
            return "\(value)"
        }
        return "\(value) -> " + String(describing: next) + " "
    }
}

extension Stack: CustomStringConvertible {
    var description: String {
        guard let top = top else {
            return "Empty stack"
        }
        return String(describing: top)
    }
}

var stackObj = Stack<Int>()
print(stackObj.isEmpty)
print(stackObj.peek())
stackObj.push(newValue: 1)
stackObj.push(newValue: 2)
stackObj.push(newValue: 3)
stackObj.push(newValue: 4)
stackObj.push(newValue: 21)

print(stackObj.peek())

print(stackObj)

print(stackObj.pop())

print(stackObj)



