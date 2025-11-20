# Time Complexity : 
# isEmpty: O(1)
# push: O(1)
# pop: O(1)
# peek: O(1)
# size: O(1)
# show: O(n)
# Space Complexity : Space Complexity is O(n)
# Did this code successfully run on Leetcode : Solved minstack successfully, The minStack needs to be traversed with the help of 
# Any problem you faced while coding this : None.
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stack = []
         
     def isEmpty(self):
          return len(self.stack) == 0
         
     def push(self, item):
          self.stack.append(item)
         
     def pop(self):
          if self.isEmpty():
              return print("Stack Empty")
          return self.stack.pop()
        
        
     def peek(self):
          if self.isEmpty():
               return print("Stack Empty")
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
