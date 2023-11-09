// Time complexity O(n)
// Space complexity O(1)

class Stack {
    var stack:[Int]
    
    init() {
        self.stack = []
    }
    
    func push(_ value: Int) {
        self.stack.insert(value,at:0)
    }
    
    func pop() -> Int {
        return self.stack.removeFirst()
    }
    
    func peek() -> Int? {
        return self.stack.first
    }
   
    func isEmpty() -> Bool {
        return self.stack.isEmpty
    }
    
    func printStack() {
        print(self.stack)
    }
}

var myStack = Stack()

myStack.push(10)
myStack.push(20)
myStack.push(30)
myStack.printStack()
myStack.pop()
myStack.printStack()
myStack.isEmpty()
myStack.peek()
myStack.printStack()
myStack.pop()
myStack.pop()
myStack.isEmpty()
myStack.peek()
myStack.printStack()
