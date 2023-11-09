# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : not a problem on leetcode
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

     def __init__(self):
         self.s = []

     def isEmpty(self):
        if not self.s:
          return False
        else:
          return True

     def push(self, item):
       self.s.append(item)

     def pop(self):
       self.s.pop()
       return self.s
        
     def peek(self):
       return self.s[0]

     def size(self):
       return len(self.s)

     def show(self):
       return self.s
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
