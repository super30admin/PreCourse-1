# Time Complexity : 0(1) 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : No
# Any problem you faced while coding this : No

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

     def __init__(self):
       self.stack = [] 
       self.size = 0

     def isEmpty(self):
       return self.stack == []

     def push(self, item):
       self.stack.append(item)
       self.size += 1  

     def pop(self):
       if not self.isEmpty():
        poppedElement = self.peek()
        del self.stack[-1]
        self.size -= 1
        return poppedElement
       else:
         return "Stack is Empty"

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

