class myStack:
  #Time complexity: For all methods it is O(1)
  #space complexity: O(n  )
     def __init__(self):
         self.stack = []

     def isEmpty(self):
         # O(1)
         return len(self.stack) == 0
         
     def push(self, item):
         self.stack.append(item)

     def pop(self):
        if not self.isEmpty():
          return self.stack.pop()
        
     def peek(self):
         if not self.isEmpty():
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