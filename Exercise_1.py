# // Time Complexity : O(1)
# // Space Complexity : O(1)


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          self.mystack = []
         
     def isEmpty(self):
          return len(self.mystack) == 0

                  
     def push(self, item):
          self.mystack.append(item)
         
     def pop(self):
          if not self.isEmpty():
            return self.mystack.pop()

        
     def peek(self):
          if not self.isEmpty():
            return self.mystack[-1]
        
     def size(self):
          return len(self.mystack)
         
     def show(self):
        print(self.mystack)

         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
s.show()
