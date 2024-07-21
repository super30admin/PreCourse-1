# Time Complexity : O(1)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.s = []
  
  def isEmpty(self):
    return 1 if len(self.s) == 0 else 0

  def push(self, item):
    self.s.append(item)
    # so if s = [1,2,3] and item = 4; s= [1,2,3,4]s

  def pop(self):
    return self.s.pop()

  def peek(self):
    return s[len(s) - 1]

  def size(self):
    return len(s)

  def show(self):
    print(self.s)

s = myStack()
s.push('1')
s.push('2')
s.push('3')
s.show()
print(s.pop())
s.show()

