"""
Time complexity: O(1)
Space complexity: O(1)

Any problem you faced while coding this: Nothing 

Explantion:

I created a stacklist and stacksize in the constructor
When we need to push a elemnent I used append function and incremented the stack size

I used pop function and decremented the stacksize 

Peek I returned the last element(i.e top of the stack) of list.
"""

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.stacklist = []
          self.stacksize = 0
         
     def isEmpty(self):
          if self.stacksize  != 0:
               return False
          return True
         
     def push(self, item):
          self.stacklist.append(item)
          self.stacksize += 1

     def pop(self):
          if not self.isEmpty():
               temp = self.stacklist.pop()
               self.stacksize -= 1
               return temp
          return None
            
     def peek(self):
          if not self.isEmpty():
               return self.stacklist[self.stacksize -1]
          return None
        
     def size(self):
          return self.stacksize
         
     def show(self):
          if self.isEmpty():
               return None
          else:
               return self.stacklist
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
#print(s.pop())
print(s.show())
print(s.peek())
