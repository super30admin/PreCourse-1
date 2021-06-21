#T(c): push - O(1), pop - O(1)
    
#Space Complexity : O(n) where n is number of elements in the stack 

class myStack:
     def __init__(self):
          self.stack = []   # Initializing empty list
         
     def isEmpty(self):
          if len(self.stack)==0:   #if len of stack is zero return True
               return True
          else:
               return False
         
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
          for item in self.stack:
               print(item)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
