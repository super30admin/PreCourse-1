# // Time Complexity : O(1)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : 
# // Any problem you faced while coding this : No
# // Your code here along with comments explaining your approach


class myStack:
     def __init__(self):
          # constructor to initiate the stack using lists
          self.stack = []
         
     def isEmpty(self):
          if self.stack == []:
               return True
          return False

     def push(self, item):
          self.stack.append(item)
         
     def pop(self):
          if self.isEmpty():
               print("Stack Underflow")
               return 0
          else:
               return self.stack.pop()

     def peek(self):
          if self.isEmpty():
               print("Stack Empty")
               return None
          else:
               return self.stack[-1]

     def size(self):
          if self.isEmpty():
               return 0
          else:
               # print("length ", len(self.stack))
               return self.stack.__len__()
               
     def show(self):
          if self.isEmpty():
               print("Stack is Empty")
          else:
               # Time Complexity of this function will be O(n)
               for i in range(0,self.size()):
                    print(self.stack[i])
         

s = myStack()
s.push('1')
s.push('2')
s.push('3')
print(s.stack)
print(s.pop())
print(s.stack)
print("Size of stack ", s.size())
s.show()

