class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  #// Time Complexity : O(1)
  #// Space Complexity : O(n)
  #// Did this code successfully run on Leetcode : Yes
  #// Any problem you faced while coding this : No
  
     def __init__(self):
        self.items = []
         
     def isEmpty(self):
        return len(self.items) == 0
         
     def push(self, item):
        self.items.append(item)
         
     def pop(self):
        if not self.isEmpty():
            return self.items.pop()
        else:
            return "List is empty"
        
     def peek(self):
        if not self.isEmpty():
            return self.items[-1]
        
     def size(self):
        return len(self.items)
         
     def show(self):
        return self.items
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
