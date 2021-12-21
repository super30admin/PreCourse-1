class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
# concepts of stack

     def __init__(self):
        self.stack = []
        self.top = -1
     def isEmpty(self):
       if self.top == -1:
         return True
         
     def push(self, item):
       self.top = self.top + 1
       print("Pushed element is: ", item)
       self.stack.append(item)

     def pop(self):
        if  self.isEmpty():
          print("Stack is empty")
        else:
          return self.stack.pop()
        
     def peek(self):
       if self.top != -1:
         print(self.stack[self.top])

     def size(self):
       return len()
         
     def show(self):
       return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
