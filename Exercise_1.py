#Time complexity: O(1)
#Space Complexity: O(1)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.items = []
         
     def isEmpty(self):
      return self.items == []
         
     def push(self, item):
      return self.items.append(item)

         
     def pop(self):
      return self.items.pop()
        
        
     def peek(self):
      return self.items[len(self.items) - 1]
        
     def size(self):
      return len(self.items)
         
     def show(self):
      return self.items[len(self.items) - 1]
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
#added few more lines to test code
print(s.size())
s.push('3')
s.push('4')
print(s.size())

