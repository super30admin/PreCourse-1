"""
Time Complexity : O(1)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :
"""
#defining MAX here to check upper limit
MAX = 1000
class myStack:
     def __init__(self):
         self.data = []
     def isEmpty(self):
          if(len(self.data) == 0):
               return True
          else:
               return False
     def push(self, item):
          """return if the array/list already has MAX=1000 
             elements as it would be a Overflow condition
             else just add/append to the list"""
          if(len(self.data) == MAX):
               print("Stack Overflow")
          else:
               self.data.append(item)
     def pop(self):
          """return if the array/list is empty as 
             it would be a Underflow condition
             else just remove that from the list"""
          if(self.isEmpty()):
               print("Stack Underflow")
               return 0
          else:
               element = self.data[-1]
               del self.data[-1]
               return element
     def peek(self):
          """return the last element of the list
              as it is stack so last element would 
              be the topmost element"""
          return self.data[len(self.data) - 1]
     def size(self):
         return len(self.data)
     def show(self):
         return self.data

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
