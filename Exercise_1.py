
# Time Complexity: O(1)
# Space complexity: O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
         self.stack = []
    def isEmpty(self):
      return len(self.stack) == 0  #this method returns true if the stack is empty
    def push(self, item):
      self.stack.append(item)    #this method pushes item into the stack
    def pop(self):
       if not self.isEmpty():    #this method pops the topmost element of the stack
            return self.stack.pop()
       else:
            return "Stack is empty"
        
    def peek(self):
        if not self.isEmpty():    #this method returns the topmost element of the stack
            return self.stack[-1]
        else:
            return "Stack is empty"
    def size(self):
      return len(self.stack)  #this method returns the size of the stack
    def show(self):
      return self.stack     #this method returns the current stack
     
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
