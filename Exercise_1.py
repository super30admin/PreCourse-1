#Overall Time Complexity O(n) and Space Complexity O(n) 
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
      self.stack = []

    def push(self, item):
      self.stack.insert(0, item)
         
    def pop(self):
      return self.stack.pop(0) 

    def peek(self):
      return self.stack[0]

        
    def size(self):
      return len(self.stack)
         
    def show(self):
      return self.stack
    
    def isEmpty(self):
      return self.stack == []
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
