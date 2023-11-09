# Time Complexity : O(1) for all operations
# Space Complexity : O(N)
# Any problem you faced while coding this : NO

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack=[]

         
     def isEmpty(self):
        if len(self.stack)==0:
           return True
        else:
           return False
         
     def push(self, item):
        self.stack.append(item)
         
     def pop(self):
        self.stack.pop()
        
     def peek(self):
         return self.stack[len(self.stack)-1]

     def size(self):
        return len(self.stack)

     def show(self):
        print(self.stack)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
