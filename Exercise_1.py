# Time Complexity : isEmpty: O(1), push: O(1), pop: O(n) due to shifting elements, peek: O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class myStack:
     def __init__(self):
      self.items = []
      self.count = 0
         
     def isEmpty(self):
      return self.count == 0
         
     def push(self, item):
      self.items.append(item)
      self.count += 1
         
     def pop(self):
      if self.isEmpty():
        return None
      self.count -= 1
      item = self.items[self.count]
      self.items.remove(item)
      return item
        
     def peek(self):
      if self.isEmpty():
          return None
      return self.items[self.count-1]
        
     def size(self):
      return self.count
         
     def show(self):
      return self.items
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print("List: ", s.show(), "Size: ", s.size())
print("Pop: ", s.pop())
print("List: ", s.show(), "Size: ", s.size())
s.push('4')
print("Peek: ", s.peek())
print("List: ", s.show(), "Size: ", s.size())
