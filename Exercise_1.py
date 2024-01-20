# Time Complexity: O(1) for push and O(1) for pop
# Space Complexity: O(n)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.arr = []
         
     def isEmpty(self):
      return self.arr.isEmpty()
         
     def push(self, item):
      self.arr.append(item)
         
     def pop(self):
      return self.arr.pop() if self.arr else None
        
     def peek(self):
      return self.arr[-1] if self.arr else None
        
     def size(self):
      return len(self.arr)
         
     def show(self):
      return self.arr
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())