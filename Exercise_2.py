class StackNode:
    def __init__(self, data):
        self.data = data
        self.next = None

class Stack:
    # Constructor to initialize the root of linked list
    def __init__(self):
        self.root = None
  
    def isEmpty(self):
        return True if self.root is None else False
  
    def push(self, data):
        newNode = StackNode(data)
        newNode.next = self.root
        self.root = newNode
        print ("% d pushed to stack" % (data))
  
    def pop(self):
        if (self.isEmpty()):
            return float("-inf")
        temp = self.root
        self.root = self.root.next
        popped = temp.data
        return popped
  
    def peek(self):
        if self.isEmpty():
            return float("-inf")
        return self.root.data
  
  
# Driver code
stack = Stack()
stack.push(10)
stack.push(20)
stack.push(30)
  
print ("% d popped from stack" % (stack.pop()))
print ("Top element is % d " % (stack.peek()))