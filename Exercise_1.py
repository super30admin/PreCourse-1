class myStack:
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          return len(self.stack) == 0
         
     def push(self, item):
          self.stack.append(item) # time - O(1)
         
     def pop(self):
          return self.stack.pop() # time - O(1)
        
     def peek(self):
          return self.stack[-1]
        
     def size(self):
          return len(self.stack)
         
     def show(self):
         for i in self.stack: # time - O(n)
              print(i)

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.size())
print(s.isEmpty())
print(s.peek())
s.show()
