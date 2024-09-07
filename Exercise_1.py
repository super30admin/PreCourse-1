class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  # Time complexity for all operations : O(1)
  # Space complexity : O(n), where n in the number of elements in the Stack
     def __init__(self):
       self.stackarr = []
         
     def isEmpty(self):
       return len(self.stackarr) == 0
         
     def push(self, item):
       return self.stackarr.append(item)
         
     def pop(self):
        return self.stackarr.pop()
        
     def peek(self):
        return self.stackarr[-1]
        
     def size(self):
        return len(self.stackarr)
         
     def show(self):
       return self.stackarr
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
