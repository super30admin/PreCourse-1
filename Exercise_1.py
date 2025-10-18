# Kindly include Time and Space complexity at top of each file

# Time Complexity:
  # push()      - O(1)
  # pop()       - O(1)
  # peek()      - O(1)
  # isEmpty()   - O(1)
  # show()      - O(N): Since we copy the list to a new list in order to
  #                     avoid external call updating the list after getting reference to the list.

# Space Complexity: O(N)

class myStack:

    def __init__(self):
      # Storing everything in a sinle array since we can directly use the array for all operations.
      self.items = []
        
    def isEmpty(self):
      # Simply check if the length of the array initialized is 0 to check if the stack is empty. 
      return len(self.items) == 0
    
    def push(self, item):
      # Check if the item is not None. If the push(None) is called we should not add anything to the stack
      if item != None:
        self.items.append(item)
        
    def pop(self):
      if self.isEmpty():
        print("Stack is empty! Cannot pop from stack.")
        return None
      else:
        return self.items.pop()
      
    def peek(self):
      if self.isEmpty():
        print("Stack is empty! Cannot peek from an empty stack.")
        return None
      else:
        return self.items[-1]
      
    def size(self):
      return len(self.items)
        
    def show(self):
      # Returning a copy of the stack so that we do not expose the items for external modification.
      return list(self.items)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
