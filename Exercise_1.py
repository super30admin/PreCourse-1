// Time Complexity : O(1) for push, pop and peek
// Space Complexity : O(n) for size of the stack
// Any problem you faced while coding this : No


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack = []
         
     def isEmpty(self):
      return not bool(self.stack)
         
     def push(self, item):
      self.stack.append(item)
         
     def pop(self):
      if(not self.isEmpty()):
          last_Element = self.stack[-1]
          del self.stack[-1]
          return last_Element

          
     def peek(self):
      if(not self.isEmpty()):
          lastElement = self.stack[-1]
          return lastElement
      
        
     def size(self):
      return len(self.stack)
         
     def show(self):
      print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
