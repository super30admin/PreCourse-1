class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  #Time Complexity:
  #Push: O(1)
  #Pop: O(1)
  #Peek: O(1)
  #isEmpty: O(1)
  #Size: O(1)
  #Show: O(n)

  #Space Complexity:
  #O(n) To store n number of elements in the stack
     def __init__(self):
      self.stack = [] #Stack initialization as List

     def isEmpty(self):
      return len(self.stack) == 0 #returns True if stack is empty
         
     def push(self, item):
      self.stack.append(item) #Adding the item on top of the stack
         
     def pop(self):
      if self.isEmpty():
        raise IndexError("Stack is empty Can't pop out")
      return self.stack.pop() #Remove and return the items on top of the stack
        
        
     def peek(self):
      if self.isEmpty():
        raise IndexError("Stack is empty No items to return")
      return self.stack[-1] #Just returning top item with removing
        
     def size(self):
      return len(self.stack) #Number of elements in the stack
         
     def show(self):
      return self.stack.copy() #Returning a copy of entire stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
