#time complexity = O(n)
#space complexity = O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack = []
     def isEmpty(self):
        if(self.stack==[]):
          return True
        else:
          return False
     def push(self, item):
         self.stack.append(item)
     def pop(self):
        if(not self.isEmpty()):
          last=self.stack[-1]
          delete(self.stack[-1])
          return last
        else:
          return ("Empty stack")
        
     def peek(self):
        
     def size(self):
         
     def show(self):
         print(self.stack)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
