# Time Complexity 
    # isEmpty = o(1)  
    # push = o(1) 
    # pop = o(1) 
    # peek = o(1)
    # size = o(1)

# Space Complexity = o(n) to store n elements
# Any problem you faced while coding this : not sure about TC of show()

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.arr = []

     def isEmpty(self):
         if self.arr:         # By default, an object is considered true unless its class defines either a __bool__() method that returns False or a __len__() method that returns zero, when called with the object. So here, if it's true, it's not empty.
            return False
         return True
     
     def push(self, item):
         self.arr.append(item)    
     
     def pop(self):
         if self.isEmpty():
               return "Can't pop! empty stack"
         else:
               return self.arr.pop() 
     
     def peek(self):
         return self.arr[-1]
     
     def size(self):
         return len(self.arr)
     
     def show(self):
         return self.arr

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
