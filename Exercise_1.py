
# Time Complexity : O(1) for all operations
# Space Complexity : O(n) where n is the number of elements in the stack
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []
         
     def isEmpty(self):
       return True if not self.stack else False
         
     def push(self, item):
       self.stack.append(item)
         
     def pop(self):
        return self.stack.pop()
        
     def peek(self):
       return self.stack[-1] if not self.isEmpty() else None
        
     def size(self):
       return len(self.stack)
         
     def show(self):
        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
