"""
Time Complexity: 
1. init - O(1)
2. isEmpty - O(1)
3. push - O(1) - Lists in python are resized dynamically to double the inital capacity and this happens exponentially, hence on average the time complexity becomes O(1)
4. pop - O(1)
5. peek - O(1)
6. size - O(1)
7. show - O(n)


Space Complexity: 
1. init - O(1)
2. isEmpty - O(1)
3. push - O(n)
4. pop - O(1)
5. peek - O(1)
6. size - O(1)
7. show - O(n)
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
           self.stack = []
         
     def isEmpty(self):
           return len(self.stack)==0
         
     def push(self, item):
           self.stack.append(item)
         
     def pop(self):
          if self.isEmpty():
                return IndexError("Stack is empty")
          return self.stack.pop()
        
     def peek(self):
           if self.isEmpty():
                 return IndexError("Stack is empty")
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
