import Cocoa

// Time Complexity - O(n)
// Space Complexity - O(n)
struct Stack<T> {
    var elements: [T] = []
    
    init() {}
    
    var isEmpty: Bool {
        elements.isEmpty
    }
    
    mutating func push(_ newValue: T) {
        elements.append(newValue)
    }
    
    mutating func pop() -> T? {
        isEmpty ? nil : elements.removeLast()
    }
    
    mutating func peek() -> T? {
        isEmpty ? nil : elements.last
    }
    
    mutating func size() -> Int {
        elements.count
    }
    
    mutating func show() {
       print(String(describing: self))
    }
}

extension Stack: CustomStringConvertible {
    var description: String {
        let topDivider = "------top------\n"
        let bottomDivider = "\n------------"
        let elementsString = elements.map { "\($0)" }.reversed().joined(separator: "\n")
        return topDivider+elementsString+bottomDivider
    }
}

var stackObj = Stack<Int>()
stackObj.push(10)
stackObj.push(20)
stackObj.push(30)

stackObj.show()

print(stackObj.size())

print(stackObj.peek())

print(stackObj.pop())
print(stackObj.pop())

stackObj.show()



