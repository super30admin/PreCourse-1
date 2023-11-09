# Time Complexity :O(1)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this :none
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.items=[]
     def isEmpty(self):
        return not bool(self.items)
     def push(self, item):
        self.items.append(item)
     def pop(self):
        return self.items.pop()    
     def peek(self):
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
