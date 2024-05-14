# Time Complexity : O(1) for isEmpty(), push(), pop(), peek(), size(), and show()operations
# Space Complexity : O(1) for isEmpty(), push(), pop(), peek(), size(), and show() operations
# Any problem you faced while coding this : No

class myStack:

  # Initializes an empty array and the length of the array
  def __init__(self):
    self.arr = []
    self.length = 0
  
  # Checks if the array is empty
  def isEmpty(self):
    return True if len(self.arr) == 0 else False
  
  # Adds an item to the end of the array
  def push(self, item):
    self.arr.append(item)
    self.length += 1
      
  # Removes an item from the end of the array and returns the removed item
  def pop(self):
    if self.length > 0:
      self.length -= 1
      return self.arr.pop()
    else:
      return "Cannot pop from an empty array!"
    
  # Returns the item at the end of the array
  def peek(self):
    return self.arr[-1]
  
  # Returns the current size of the array
  def size(self):
    return self.length
  
  # Returns the current array
  def show(self):
    return self.arr

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
