class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  #Time complexity: O(1)
  #Space complexity: O(1)
  #Did this code successfully run on Leetcode : Yes
  #Any problem you faced while coding this : No 
     def __init__(self):
         self.stack=[]
         
     def isEmpty(self):
         return self.size() ==0
         
     def push(self, item):
         self.stack.append(item)
         
     def pop(self):
         if self.isEmpty():
             return 'Stack is empty'
         else:
             return self.stack.pop()
        
     def peek(self):
         if self.isEmpty():
             return 'Stack is empty'
         else:
             return self.stack[-1]
         
        
     def size(self):
         return len(self.stack)
         
     def show(self):
         return self.stack
         
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.peek())
print(s.size())
print(s.pop())
print(s.size())
print(s.peek())
print(s.pop())
print(s.isEmpty())
print(s.pop())
print(s.isEmpty())
print(s.peek())
print(s.pop())
print(s.show())
