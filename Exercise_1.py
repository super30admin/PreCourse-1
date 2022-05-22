#Space complexity is O(n)
#Time complexity O(1) all operations
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack=[]
     def isEmpty(self):
         return self.stack == []
     def push(self, item):
         self.stack.append(item)
     def pop(self):
        if(not self.isEmpty()):
          get = self.stack[-1]
          del(self.stack[-1])
          return get
        else:
          return("Empty stack")
     def peek(self):
        if(not self.isEmpty()):
          get = self.stack[-1]
          return get
     def size(self):
         return len(self.stack)
     def show(self):
         print(self.stack)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
