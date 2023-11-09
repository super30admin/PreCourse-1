# Time Complexity: O(1)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class myStack:
     def __init__(self):
         self.arr = []

     def isEmpty(self):
          return True if self.size() == 0 else False

     def push(self, item):
          self.arr.append(item)

     def pop(self):
          return self.arr.pop()

     def peek(self):
          return self.arr[-1]

     def size(self):
          return len(self.arr)

     def show(self):
         return self.arr


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
