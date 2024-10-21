# Time Complexity:
# isEmpty() : O(1)
# push() : O(1)
# pop() : O(1)
# peek() : O(1)
# size() : O(1)
# show() : O(1)

#Space Complexity:
# O(n)
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
       if not self.isEmpty():
         return self.stack.pop()
       else:
         return "Stack is Empty"
           
     def peek(self):
       if not self.stack.isEmpty():
         return self.stack[-1]
       else:
         return "Stack is Empty"
        
     def size(self):
       return len(self.stack)
         
     def show(self):
       return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
