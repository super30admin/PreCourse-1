class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
# Time Complexity:
# Push, Pop, Peek, Is Empty, Size: O(1).
# Show: O(n).
# Space Complexity: O(n), where n is the number of elements in the stack.
    def __init__(self):
      self.stack = []
         
    def isEmpty(self):
      return len(self.stack) == 0
         
    def push(self, item):
      self.stack.append(item)
    
    def pop(self):
      if self.isEmpty():
        raise IndexError("Pop from an empty stack")
      return self.stack.pop()    
        
    def peek(self):
      if self.isEmpty():
        raise IndexError("Peek from an empty stack")
      return self.stack[-1]
        
    def size(self):
      return len(self.stack)
         
    def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.size())
print(s.peek())
print(s.isEmpty())
print(s.pop())
print(s.show())