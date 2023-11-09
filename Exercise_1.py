class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  #Time Complexity: All operations=> O(1)
  #Space Complexity: O(1)

     def __init__(self):
      self.stack = []

     def isEmpty(self):
      if self.stack == []:
        return True
      return False
         
     def push(self, item):
      if item is not None:
        self.stack.append(item)
        print(item,"is pushed to Stack.")
         
     def pop(self):
      return self.stack.pop()
        
     def peek(self):
      return self.stack[len(self.stack)-1]
        
     def size(self):
      return len(self.stack)
         
     def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
