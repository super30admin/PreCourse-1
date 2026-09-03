
#Time Complexity :
#Space Complexity :
#Did this code successfully run on Leetcode :
#Any problem you faced while coding this :

#Your code here along with comments explaining your approach

#Exercise_1 : Implement Stack using Array.
class myStack:
      #initializing the stack and top variable
     def __init__(self): 
      self.stack = []
      self.top = -1
         
     def isEmpty(self):
      return self.top == -1
    
     def push(self, item):
      self.top += 1
      self.stack.append(item)
         
     def pop(self):
      if self.top == -1:
        print("stack is empty")
        return None
      self.top -= 1
      return self.stack.pop()
        
     def peek(self):
      return self.stack[self.top]
     
     def size(self):
      count = 0
      for i in range(self.top, -1, -1):
        if self.top == -1:
          count = 0
        else:
          count += 1
      return count

     def show(self):
      for i in range(self.top, -1, -1):
        print(self.stack[i])

s = myStack()
s.push('1')
s.push('2')
s.pop()
s.show()
