# Time complexity - Push operation --> O(n)
#                   Pop operation --> O(1)
#                   peek operation --> O(1)
#                   show operation --> O(1)
# Total Time complexity --> O(n)
# Space Complexity --> O(n) for the array of size n
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.items = []
         
     def isEmpty(self):
      self.items == []
      return self.items

         
     def push(self, item):
       if item not in self.items:
        self.items.append(item)
         
     def pop(self):
        return self.items.pop()

     def peek(self):
      return self.items[0]
        
     def size(self):
         return len(self.items)

     def show(self):
      return self.items
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
