
#Did this code successfully run on Leetcode :
#Any problem you faced while coding this :

#Your code here along with comments explaining your approach

#Exercise_1 : Implement Stack using Array.
# class myStack:
#       #initializing the stack and top variable
#      def __init__(self): 
#       self.stack = []
#       self.top = -1
         
#      def isEmpty(self):
#       return self.top == -1
    
#      def push(self, item):
#       self.top += 1
#       self.stack.append(item)
         
#      def pop(self):
#       if self.top == -1:
#         print("stack is empty")
#         return None
#       self.top -= 1
#       return self.stack.pop()
        
#      def peek(self):
#       return self.stack[self.top]
     
#      def size(self):
#       count = 0
#       for i in range(self.top, -1, -1):
#         if self.top == -1:
#           count = 0
#         else:
#           count += 1
#       return count

#      def show(self):
#       for i in range(self.top, -1, -1):
#         print(self.stack[i])

#Solution 2

class myStack:
  def __init__(self):
    self.stack = []
    self.top = -1
  
  def isEmpty(self):
    return len(self.stack) == 0
  
  def push(self, item):
    self.stack.append(item)
  
  def pop(self):
    if self.isEmpty():
      raise IndexError("Stack is emtpy nothing to pop")
    return self.stack.pop()

  def peek(self):
    if self.isEmpty():
      raise IndexError("Stack is empty no peek element")
    print(self.stack[-1])
    return self.stack[-1]

  def size(self):
    return len(self.stack)

  def show(self):
    print(self.stack)

s = myStack()
s.push('1')
s.push('2')
s.pop()
s.peek()
s.show()

#Time Complexity : O(1) for all functions. show() O(n)
#Space Complexity :O(n) size of stack


