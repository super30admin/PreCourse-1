Time complexity: O(1) for isEmpty, push, pop, peek. O(n) for size and show.
Space complexity: O(1) for all
Executed in Leetcode: No link. Code executed in jupyter notebook.
Challenges: Not sure about time and space complexity.  Can we use size() function in peek?
     
class myStack:
     def __init__(self):
          self.items = []
         
     def isEmpty(self):
          return self.items == []
         
     def push(self, item):
          return self.items.append(item)
         
     def pop(self):
          return self.items.pop()
        
     def peek(self):
          return self.items[size(self) - 1]   # Can we do this?
        
     def size(self):
          return len(self.items)
         
     def show(self):
          return self.items
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
