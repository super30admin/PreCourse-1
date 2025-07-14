# Time complexity:
# push: O(1)
# pop: O(1)
# peek: O(1)
# isEmpty: O(1)
# size: O(1)
# show: O(n)
# Space complexity: O(n) 
# Did this code successfully run on Leetcode : Couldn't find the problem on Leetcode
# Any problem you faced while coding this : None


class myStack:
     def __init__(self):
          self.items = []
         
     def isEmpty(self):
          return len(self.items) == 0
         
     def push(self, item):
          self.items.append(item)
         
     def pop(self):
          if self.isEmpty():
              return None
          return self.items.pop()
        
     def peek(self):
          if self.isEmpty():
              return None
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
