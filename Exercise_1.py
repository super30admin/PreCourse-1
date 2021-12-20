# Time Complexity :
"""
Push : O(n)
Pop : O(1)
"""
# Space Complexity :
"""
Stack object O(n)
"""
# Did this code successfully run on Leetcode :
"""
"""
# Any problem you faced while coding this :
"""

"""
# Time Complexity :
"""
Push : O(n)
Pop : O(1)
"""
# Space Complexity :
"""
Stack object O(n)
"""
# Did this code successfully run on Leetcode :
"""
"""
# Any problem you faced while coding this :
"""

"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.arr = []

     def isEmpty(self):
         if self.size() == 0:
            return True
         else:
            return False

     def push(self, item):
         self.arr.insert(0, item)

     def pop(self):
         if not self.isEmpty():
             item = self.arr[-1]
             self.arr = self.arr[:-1]
             return item
         else:
             return

     def peek(self):
         return self.arr[0]

     def size(self):
         return len(self.arr)

     def show(self):
         return self.arr

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
