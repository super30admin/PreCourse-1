# Time Complexity : all operations O(1). show() method  O(N)
# Space Complexity : O(N) where N is total elements pushed
# Any problem you faced while coding this : no

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
      # Init max size of stack
      self.MAX = 1000
      self.top=-1
      self.arr = [None for i in range(self.MAX)]
        
    def isEmpty(self) -> bool:
      return self.top < 0 # if top == -1, then stack is empty
        
    def push(self, item) -> bool:
      # check if stack max capacity is reached
      if self.top == self.MAX-1:
        return False
      else:
        # increment top and add element
        self.top += 1
        self.arr[self.top] = item
        return True
        
    def pop(self) -> int:
      # check if stack is empty. Return None if true
      if self.top == -1:
        return None
      # get the top element and decrement top ptr
      pop_element = self.arr[self.top]
      self.top -= 1
      return pop_element
      
    def peek(self):
      # check if stack is empty. Return None if true
      if self.top == -1:
        return None
      return self.arr[self.top] # just return the top element

      
    def size(self):
      return self.top+1 # top pointer + 1 gives the size of stack 
        
    def show(self): # return the array 
      return self.arr         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
