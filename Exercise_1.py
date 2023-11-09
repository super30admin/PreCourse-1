# Time Complexity : All operations take O(1) time complexity
# Space Complexity : All operations take O(1) space complexity
# My solution executed on leetcode
# No problems faced

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  # Defining an empty stack list
     def __init__(self):
      self.Stack = []

  # Checking if the stack is empty 
     def isEmpty(self):
      return self.Stack == []

  # Appending an item on top of stack
     def push(self, item):
      self.Stack.append(item)

  # Deleting and return element on top of stack
     def pop(self):
      if not self.isEmpty():
        topElement = self.Stack[-1]
        del(self.Stack[-1])
        return topElement
      else:
        return 'Stack is Empty' 

  # Returning top element
     def peek(self):
      if not self.isEmpty():
        return self.Stack[-1]
      else:
        return 'Stack is empty'

  # Returning size of the stack    
     def size(self):
      return len(self.Stack)

  # Returning the stack       
     def show(self):
      return self.Stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

