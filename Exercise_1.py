class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    # Time Complexity :
    # Push: O(1)
    # Pop: O(1)
    # Peek: O(1)
    # Size: O(1)
    # Show: O(n)
    # Space Complexity: O(n)
  
    def __init__(self):
        self.stack = []
        
    def isEmpty(self):
        return len(self.stack) == 0
        
    def push(self, item):
        self.stack.append(item)
        
    def pop(self):
        if self.isEmpty():
            return "Stack is empty"
        return self.stack.pop()
       
    def peek(self):
        if self.isEmpty():
            return "Stack is empty"
        return self.stack[-1]
       
    def size(self):
        return len(self.stack)
        
    def show(self):
        return self.stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())  # Outputs: '2'
print(s.show())  # Outputs: ['1']
#

