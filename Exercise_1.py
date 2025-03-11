# Time Complexity:
# isEmpty(): O(1) - Checking if stack is empty takes constant time
# push(): O(1) - Adding an element to the top of the stack takes constant time
# pop(): O(1) - Removing an element from the top of the stack takes constant time
# peek(): O(1) - Viewing the top element takes constant time
# size(): O(1) - Getting the size of the stack takes constant time
# show(): O(n) - Displaying all elements takes linear time where n is the number of elements

# Space Complexity: O(n) - where n is the maximum number of elements in the stack
class myStack: 

  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      # Initialize an empty list to represent the stack
      self.stack = []
         
     def isEmpty(self): 
      # Return True if stack is empty, False otherwise
      return len(self.stack) == 0
         
     def push(self, item): 
      # Add an item to the top of the stack
      self.stack.append(item)
         
     def pop(self): 
      # Remove and return the top item from the stack
      # If stack is empty, return None
      if self.isEmpty():
        return None
      return self.stack.pop()
        
     def peek(self): 
      # Return the top item without removing it
      # If stack is empty, return None
      if self.isEmpty():
        return None
      return self.stack[-1]
        
     def size(self): 
      # Return the number of items in the stack
      return len(self.stack)
         
     def show(self): 
      # Return a string representation of the stack
      return str(self.stack)

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
