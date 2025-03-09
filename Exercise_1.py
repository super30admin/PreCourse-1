# Time Complexity:
# push: O(1)
# pop: O(1)
# peek: O(1)
# isEmpty: O(1)
# size: O(1)
# show: O(n)

# Space Complexity: O(n)

# Did this code successfully run on Leetcode : Yes
'''
my output:
komalbhavake$ python3 Exercise_1.py
2
['1']

'''
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          return len(self.stack) == 0
         
     def push(self, item):
          return self.stack.append(item)
         
     def pop(self):
          if self.isEmpty():
               raise IndexError("Stack is Empty")
          return self.stack.pop()
     
     def peek(self):
          if self.isEmpty():
               raise IndexError("Stack is Empty")
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
