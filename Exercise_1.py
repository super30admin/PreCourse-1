// Time Complexity : O(1)
// Space Complexity : O(n)
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
      self.stack.pop()
        
        
     def peek(self):
      if self.stack is None:
        return None
      else:
        return self.stack[-1]
        
     def size(self):
      return len(self.stack)
         
     def show(self):
      print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
