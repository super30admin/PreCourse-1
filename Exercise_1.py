class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     '''
        Space Complexity: O(n)
        Time Complexity: O(1)
     '''
     def __init__(self):
          self.stack = []
          self.top = -1
         
     def isEmpty(self):
          if self.top == -1:
               return True
          return False
         
     def push(self, item):
         self.stack.append(item)
         self.top += 1

     def pop(self):
        if self.isEmpty():
            return None
        self.top -= 1
        return self.stack.pop()
        
     def peek(self):
        if self.isEmpty():
            return None
        return self.stack[self.top]
        
     def size(self):
         return self.top + 1
     
     def show(self):
         return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
