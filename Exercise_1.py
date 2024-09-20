#Space Complexity is O(1)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
      #initialize empty stack
      self.stack = []
     
    def isEmpty(self):
      #True if Stack is empty otherwise false
      return len(self.stack) == 0
        
    def push(self, item):
      self.stack.append(item)
      print(f"{item} added in Stack")       
         
    def pop(self):
      if self.isEmpty():
        return "Stack Empty"
      self.stack.pop()  
        
    def peek(self):
      if self.isEmpty():
        return "Stack Empty"
      return self.stack[-1]
      
    def size(self):
      return len(self.stack)
         
    def show(self):
      return self.stack if not self.isEmpty() else "Stack Empty"
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(f"Top element of stack is: {s.peek()}")
print(s.pop())
print(s.show())
