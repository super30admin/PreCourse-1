"""
T.C. - 
All operations except show are O(1) 
Show is O(n)

S.C. - O(n) where n is the number of items (size of array)

"""
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack = []
      self.size = 0
         
     def isEmpty(self):
      if self.size == 0:
        return True
      return False
         
     def push(self, item):
      self.stack.append(item)
      self.size += 1
         
     def pop(self):
      if self.size == 0:
        return '0000'
      ret = self.stack.pop()
      self.size -= 1
      return ret
      
     def peek(self):
      return self.stack[-1]
        
     def size(self):
      return self.size
         
     def show(self):
      return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.pop())
print(s.show())
