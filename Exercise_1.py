# Time complexity - For push, and pop the time complexity is O(1) as in push we are just appending and pop we are reducing the size by -1
# Space Complexity - O(n) the array size
class myStack:
  def __init__(self):
    self.stack = []
    self.size_ = 0

  def isEmpty(self):
    if self.size_ == 0:
      return True
    return False

  def push(self, item):
    self.stack.append(item)
    self.size_ += 1
    return None

  def pop(self):
    if self.isEmpty():
      return None
    pop_element = self.stack[self.size_-1]
    self.size_ -= 1
    return pop_element

  def peek(self):
    return self.stack[self.size_-1]
    
  def size(self):
    return self.size_
  
  def show(self):
    return self.stack[:self.size_]

s = myStack()
s.push('1')
s.push('2')
s.push('10')
s.push('20')
s.push('40')
print(s.show())
print(s.size())
print(s.pop())
print(s.peek())
print(s.show())