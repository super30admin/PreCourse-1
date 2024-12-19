# Time Complexity :
# isEmpty = O(1)
# push = O(1)
# pop = O(1)
# peek = O(1)
# size = O(1)
# show = O(n)

# Space Complexity : O(n)

# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.my_stack = []
         
     def isEmpty(self):
          return len(self.my_stack) == 0
         
     def push(self, item):
          self.my_stack.append(item)
          
         
     def pop(self):
          if self.isEmpty():
               return None
          else:
               return self.my_stack.pop()
        
        
     def peek(self):
          if self.isEmpty():
               return None
          else:
               return self.my_stack[-1]
        
     def size(self):
          return len(self.my_stack)
         
     def show(self):
          return self.my_stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())