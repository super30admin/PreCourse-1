class myStack:
  stack = []

  def __init__(self):
    self.stack = []

  # Time Complexity: O(1)
  def isEmpty(self):
    return len(self.stack) == 0

  # Time Complexity: O(1)
  def push(self, item):
    #Insert at end of array
    self.stack.append(item)

  # Time Complexity: O(1) Since we always pop last element
  def pop(self):
    #If empty array, nothing to pop
    if self.isEmpty():
      return float('-inf')
    
    #Remove from last position of array
    return self.stack.pop()
    
  # Time Complexity: O(1)
  def peek(self):
    #If empty array, nothing to pop
    if self.isEmpty():
      return float('-inf')
    
    #Read from last position of array
    return self.stack[len(self.stack) - 1]

  # Time Complexity: O(1)
  def size(self):
    return len(self.stack)

  # Time Complexity: O(N)
  def show(self):
    output = []
    
    # If "show" is guarenteed to be the last operation
    while not self.isEmpty():
      output.append(self.pop())
    
    #If "show" is not guarenteed to be last operation
    #or we want to keep the items in stack
    # for i in range(len(self.stack) - 1, -1, -1):
    #   output.append(self.stack[i])

    return output

#Case-1
print("CASE 1")
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

#Case-2
print("CASE 2")
s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.push('4')
print(s.pop())
print(s.show())

#Case-3
print("CASE 3")
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.pop())
print(s.show())

#Case-4
print("CASE 4")
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.pop())
print(s.pop())
print(s.show())

#Case-5
print("CASE 5")
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.peek())
print(s.show())

#Case-6
print("CASE 6")
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.pop())
print(s.peek())
print(s.show())
