# Time Complexity: Push, Pop, Peek, Size, Show - O(1)
# Space Complexity : O(n) where n is the number of elements in the stack

# Implement Stack using Array: Here used Python List which provides operations append() for push, pop() for pop, and indexing for peek.

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.items = []
     def isEmpty(self):
      return len(self.items) == 0
     def push(self, item):
      self.items.append(item)
     def pop(self):
      if not self.isEmpty():
       return self.items.pop()
      return None
     def peek(self):
      if not self.isEmpty():
       return self.items[-1]
      return None
     def size(self):
      return len(self.items)
     def show(self):
      return self.items

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
