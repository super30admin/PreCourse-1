# Time Complexity:
#O(1) for isEmpty(), push(), pop() and peek()
#O(n) for size()

# Space complexity
# O(1) for isEmpty(), pop(), peek()
# O(n) for push()



class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack = []
         
     def isEmpty(self):
      if self.stack.empty():
        return True
      else:
        return False
         
     def push(self, item):
       self.stack.append(item)
         
     def pop(self):
       toRemove = self.stack[-1]
       self.stack.remove(toRemove)
        
        
     def peek(self):
       return self.stack[-1]
        
     def size(self):
      return len(self.stack)
         
     def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
