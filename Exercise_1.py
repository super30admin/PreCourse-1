# Time Complexity : 
# For Push, Pop, isEmpty, Peel, Size = O(1) and 
# For Displaying Show O(n) in the worst case, i.e., only Push Calls are made and no pop calls are made.

# Space Complexity : 
# O(n) where n is the stream of input coming into the class myStack. 
# Same worst case as above.

# Did this code successfully run on Leetcode : NA

# Any problem you faced while coding this : No

class myStack:
     def __init__(self):
       self.stack = [] 
         
     def isEmpty(self):
       return len(self.stack) == 0 
         
     def push(self, item):
       self.stack.append(item)
         
     def pop(self):
       if self.isEmpty():
         print("No Elements to Pop")
         return -1
       return self.stack.pop()
        
        
     def peek(self):
       self.stack[-1]
        
     def size(self):
       return len(self.stack)
         
     def show(self):
       return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
