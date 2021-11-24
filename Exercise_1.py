class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # Time Complexity : O(n)
    # Space Complexity: O(1)

     def __init__(self):
       self.myStack = []
       self.top = -1
         
     def isEmpty(self):
       return self.size == 0
         
     def push(self, item):
       self.top += 1
       self.myStack.append(item)
         
     def pop(self):
       if self.top == -1:
         print("Stack is empty")
       self.top = -1
       return self.myStack.pop()
        
        
     def peek(self):
       self.stack[self.top]
        
     def size(self):
       return self.size()

         
     def show(self):
       for i in range(self.top, -1, -1):
         if i == self.top:
           return (self.myStack[i]," <======")
         else:
           return(self.myStack[i])
        
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
