class myStack:
  
  # // Time Complexity : O(n) where n is the number of calls made to the stack
  #  show function displays the entire stack which will incur O(n) operations
  #  making the time complexity for entire program to be O(n)
  #  otherwise remaining functions are of O(1) complexity
  # // Space Complexity : O(n) where n is the number of items pushed in the stack
  # // Did this code successfully run on Leetcode : Couldn't find it on leetcode. Any link?
  # // Any problem you faced while coding this : not clear about some of the functions like 'show'


  # // Your code here along with comments explaining your approach

  # initializing the stack
  def __init__(self):
    self.stack = []
    self.size = 0


  def isEmpty(self):
    # if size < 1 then the stack is empty
    if self.size < 1:
      return True
    return False
    
    
  def push(self, item):
    # adding the new item on the top of the stack
    # and incresing the size counter
    self.stack.append(item)
    self.size += 1


  def pop(self):
    # In O(1) time checking if the stack is not empty
    # popping the top item and returning if stack
    # otehrwise printing 'stack overflow'
    if self.stack:
      item = self.stack.pop()
      self.size -= 1
      return
    print("Stack overflow!")
    return 0


  def peek(self):
    # in O(1) time accessing the top of the stack 
    # and returning it if it exists
    if self.stack:
      return self.stack[-1]

    
  def size(self):
    return self.size
      

  def show(self):
    # no clear definition for it
    # assuming it means show full stack
    for i in range(self.size):
      print(self.stack[i],"-->",end = " ")
          

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

      

     
           
         
     
         

