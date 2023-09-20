## Exercise_1 : Implement Stack using Array.
# Time Complexity : O(1) for all functions
# Space Complexity : O(n) where n is length of array.
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this : NA

class myStack:
     def __init__(self):
         self.arr = []
         self.top = 0

     def isEmpty(self):
         return self.top < 0 ? True : False

     def push(self, item):
        self.arr[self.top] = item
        self.top += 1

     def pop(self):
        if self.isEmpty():
          return "Stack is empty"
        self.top -= 1
        
     def peek(self):
        if self.isEmpty():
          return "Stack is empty"
        return self.arr[self.top]
          
     def size(self):
        return len(self.arr)

     def show(self):
        return self.arr

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.pop())
print(s.show())
