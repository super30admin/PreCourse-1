# Exercise_1 : Implement Stack using Array.

# Time Complexity : o(1) for all the operations
# Space Complexity : o(n) where n is the length of the stack
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class myStack:
  def __init__(self):
    self.items = []  #Initialize empty array - items
      
  def isEmpty(self):
    return len(self.items) == 0 #return True if length of item is zero False otherwise
      
  def push(self, item):
    self.items.append(item) #append to the array
        
  def pop(self):
    if len(self.items) == 0:
      print("Cannot Pop from an empty array")
    return self.items.pop() #Pop from the array
    
  def peek(self):
    if len(self.items) == 0:
          print("Stack is Empty")
    return self.items[len(self.items)-1] #return the element at the last index
    
  def size(self):
    return len(self.items) # return length (size)
    
  def show(self):
    return self.items # return the array(stack)
         

s = myStack()

# Test Case 1 provided by S30
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

# Output (Expected = Obtained)
# 2
# ['1']

#Custom Test Case 2 -> Result -> Passed

# s.push('8')
# s.push('2')
# s.push('0')
# s.pop()
# print(s.show())
# print(s.isEmpty())
# print(s.size())
# print(s.peek())

# Output (Expected = Obtained)
# ['8', '2']
# False
# 2
# 2

