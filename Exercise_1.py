class myStack:
# // Time Complexity : Push, Pop, Peek, isEmpty, size : O(1)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : 
# // Any problem you faced while coding this :
     def __init__(self):
      self.l = []
         
     def isEmpty(self):
      if len(self.l)==0:
        return True
         
     def push(self, item):
      # last in first out, so i push the new element at the index 0
      self.l.insert(0, item)
         
     def pop(self):
      # the most recent element that has inserted has to be poped, the element at 0 index
      return(self.l.pop(0))
        
     def peek(self):
      # peek only look at the element and should not delete it
      return self.l[0]
        
     def size(self):
      return len(self.l)
         
     def show(self):
      return self.l
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.show())
print(s.pop())
print(s.show())
