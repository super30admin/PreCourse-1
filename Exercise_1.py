class myStack:
  #Time Complexity - O(1) , Space Complexity - O(N)
     def __init__(self):
       self.stack = []

     def isEmpty(self):
       if len(self.stack) == 0:
         return True
       return False
         
     def push(self, item):
       self.stack.append(item)

     def pop(self):  
        return self.stack.pop(-1)
        
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
