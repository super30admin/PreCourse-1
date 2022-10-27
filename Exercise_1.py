'''

Time Complexity:
O(1) for push and pop operations


Space Complexity:
O(1) is the space complexity


'''

class myStack:
   def __init__(self):

      self.s=[]
      self.top=-1
         
   def isEmpty(self):
      if self.top == -1:
         return "Stack is Empty"
      
         
   def push(self, item):
      self.top = self.top+1
      self.s.append(item)
         
   def pop(self):
      if self.top == -1:
         return "Stack is Empty, Nothing to POP"
      else:
         self.top = self.top-1
         return self.s.pop()
        
        
   def peek(self):
      return self.s[self.top]
        
   def size(self):
      size_stack = self.top+1
      return size_stack
         
   def show(self):
      for i in range(self.top,-1,-1):
         if i == self.top:
            print(self.s[i], "<----Top of stack")
         else:
            print(self.s[i])
         
         

s = myStack()
s.push('1')
s.push('2')
s.show()
print(s.pop())
print(s.peek())
print(s.size())
s.pop()
print(s.isEmpty())
