#  Time Complexity : O(1)
#  Space Complexity : O(n)



class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []
         
     def isEmpty(self):
       return True if len(self.stack) == 0 else False
         
     def push(self, item):
       self.stack.append(item)
         
     def pop(self):
       return Exception("Pop operation not possible on an Empty Stack.") if self.isEmpty() else self.stack.pop()
        
        
     def peek(self):
       return self.stack[-1]
        
     def size(self):
       return len(self.stack)
         
     def show(self):
       res = []
       for item in self.stack:
         res.append(item)
       return res
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
