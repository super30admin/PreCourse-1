# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Could n't find problem in leetcode


class myStack:

     def __init__(self):
      # initilizing stack and top variable
      self.top=-1
      self.stack=[]
         
     def isEmpty(self):
      if self.top==-1:
        return True
      return False
         
     def push(self, item):
      # incrementing the top variable and inserting the element into the stack
      self.top+=1
      self.stack.append(item)
         
     def pop(self):
      if self.isEmpty():
        print("Operation cannot be performed : stack is empty")
        return -1
      self.top-=1
      return self.stack.pop()
        
        
     def peek(self):
      return self.stack[self.top]
        
     def size(self):
      return len(self.stack)
         
     def show(self):
      for i in range(self.top+1):
        print(self.stack[i],end=' ')
      return " : Elements in stack"
         

s = myStack()
s.push('1')
s.push('2')
print(s.show(),end='\n')
print(s.pop())
print(s.pop())
print(s.pop())
print(s.show())
while(1 and 0):
  print("written by Surendra")
