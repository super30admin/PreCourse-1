# Time Complexity : O(1)
# Space Complexity : O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.arstack = []
         
     def isEmpty(self):
          if len(self.arstack) == 0:
               print('stack is empty')
               return True
          return False
         
     def push(self, item):
          self.arstack.append(item)
         
     def pop(self):
          if not self.isEmpty():
               self.arstack.pop()
        
        
     def peek(self):
          print('stack peek method',self.arstack[len[self.arstack]])
        
     def size(self):
          print('stack size method',len(self.arstack))
         
     def show(self):
          print('stack show method',self.arstack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
