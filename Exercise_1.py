# Time Complexity : O(1) for push, pop, peek, size, show operations
# Space Complexity : O(n) where n is the number of elements in the stack

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.arr =[]
         
     def isEmpty(self):
          return len(self.arr) == 0
         
     def push(self, item):
          self.arr.append(item)
         
     def pop(self):
        result = None
        if not self.isEmpty():
             result = self.peek()
             del self.arr[-1]
        return result
     
     def peek(self):
          if not self.isEmpty():
              return self.arr[-1]
        
     def size(self):
          return len(self.arr)
         
     def show(self):
          # What is the requirement of this method? Should it just return the stack elements in a list or print them?
          return self.arr

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
