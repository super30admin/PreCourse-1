class myStack:
     def __init__(self):
         self.stack = []
         self.size = 0 # can use len() function but I wanted to do it this way using another variable.
         
     def isEmpty(self):
         return (self.size == 0)
         
     def push(self, item):
         self.stack.append(item)
         self.size += 1
         
     def pop(self):
        if self.isEmpty():  # check for a corner-case
            return None
        else:
            self.size -= 1
            return self.stack.pop()
        
     def peek(self):
         if self.isEmpty():
             return None
         else:
             return self.stack[-1]
        
     def size(self):
         return self.size
         
     def show(self):
         return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
