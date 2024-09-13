class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      self.stack = []

     def isEmpty(self):
      if len(self.stack)==0:
        return True
      return False
         
     def push(self, item):
      self.stack.append(item)
         
     def pop(self):
      if self.isEmpty():
        print("Stack is Empty")
        return "Stack is Empty"
      else:
        last_element = self.stack.pop()
        return last_element
        
     def peek(self):
      if self.isEmpty():
        print("Stack is Empty")
        return "Stack is Empty"
      else:
        
        return self.stack[-1]
      

     def size(self):
      return len(self.stack)
         
     def show(self):
         return self.stack
      
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

# Complexities
# Time Complexity Push - O(1)
# Time Complexity Pop - O(1)
# Space complexity - O(N)