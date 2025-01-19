'''
Overall:
Time Complexity O(1)
Space Complexity O(n)
// Did this code successfully run on Leetcode : Not sure if it exist in LeetCode
// Any problem you faced while coding this : No, as per as i can think.
Optimizations:
can we optimized by introducing a maxsize attribute to avoid overflow.
'''
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  def __init__(self):
    self.stk = []
    self.count = 0
      
  def isEmpty(self):
    return self.count==0
      
  def push(self, item):
    self.stk.append(item)
    self.count+=1
      
  def pop(self):
    if self.isEmpty():
      raise Exception("Cannot pop from an empty stack")
    self.count-=1
    return self.stk.pop()
        
  def peek(self):
    if not self.isEmpty():
        return self.stk[-1]
    raise Exception("Cannot peek from an empty stack")
    
  def size(self):
    return self.count
      
  def show(self):
    return self.stk
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())