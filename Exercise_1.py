# TC: O(1) for all operations
# SC: O(n) where n is the number of elements in the stack

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack = []
     def isEmpty(self):
         return len(self.stack) == 0
     def push(self, item):
         self.stack.append(item)
     def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        return None
        
     def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        return None
     def size(self):
         return len(self.stack)
     def show(self):
         return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())