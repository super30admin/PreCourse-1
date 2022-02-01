# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : N/A
# Any problem you faced while coding this : No

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stackArray = []
         self.top = -1
         self.maxSize = 5
     def isEmpty(self):
         if self.top == -1:
           return "Stack is empty"
         return "Stack is not empty"  
     def push(self, item):
        if self.top == self.maxSize-1:
          return "Stack is full ! Failed to update stack"
        self.stackArray.append(item)
        self.top =self.top + 1
        return "stack is updated"
     def pop(self):
        if self.top == -1:
          return "No elements in stack to pop"
        self.top = self.top - 1  
        return self.stackArray.pop()
     def peek(self):
        if self.top == -1:
          return "stack is empty"
        return self.stackArray[self.top]
     def size(self):
        return self.top+1
     def show(self):
        return self.stackArray       

s = myStack()
print(s.isEmpty())
print(s.push('1'))
print(s.isEmpty())
print(s.push('2'))
print(s.push('3'))
print(s.push('4'))
print(s.push('5'))
print(s.push('6'))
print(s.show())
print(s.size())
print(s.peek())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
print(s.pop())
