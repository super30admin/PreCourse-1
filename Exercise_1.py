#Time Complexity : O(1) except for show() - O(n)
#Space Complexity : O(n)

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
         if self.isEmpty():
            return None
         else:
            return self.stack.pop()
        
    def peek(self):
         if self.isEmpty():
           return None
         else:
           return self.stack[-1]
        
    def size(self):
         return len(self.stack)
         
    def show(self):
         if self.isEmpty():
           return None
         else:
           return self.stack[:]
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
