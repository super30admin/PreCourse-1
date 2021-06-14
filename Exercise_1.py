#implement stack using array

# Time complexity: push, peek, size, pop : O(1)
# Time complexity of show : O(n)
# Space complexity: O(1) 
# Any problem you faced while coding this : Array operations

from sys import maxsize
class myStack:

     mystk = []
     # initialize the array
     def __init__(self):
          self.mystk = []

     # if stack is empty     
     def isEmpty(self):
          return len(self.mystk) == 0

     # push element onto stack
     def push(self, item):
          self.mystk.append(item)
          print(item + " pushed to stack")

     # pop element from stack  
     # check for underflow  
     def pop(self):
          if self.isEmpty():
               return str(-maxsize - 1)
          return self.mystk.pop()

     # returns the topmost element from the stack   
     def peek(self):
          if self.isEmpty():
               return str(-maxsize - 1)
          return self.mystk[len(self.mystk)-1]

     # get the size of the stack
     def size(self):
          return len(self.mystk)

     # print the stack
     def show(self):
          return "The stack is: ", self.mystk

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.size())
print(s.peek())
print(s.pop())
print(s.show())
