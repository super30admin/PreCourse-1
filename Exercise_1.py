'''

 Implement stack using Array

For all operation
Time Complexity : O(1)
Space Complexity :O(1)
Did this code successfully run on Leetcode : did not find in leetcode
Any problem you faced while coding this : No
Your code here along with comments explaining your approach'''


class myStack:
     def __init__(self):
          self.temp =[]
         
     def isEmpty(self):
          return self.temp == []
         
     def push(self, item):
          self.temp.append(item)
         
     def pop(self):
        return self.temp.pop() 
        
     def peek(self):
          return self.temp[len(self.temp)-1] 
        
     def size(self):
          return len(self.temp) 
         
     def show(self):
         return self.temp
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
