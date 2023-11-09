class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file

  # Time Complexity:
    # push(): O(1)
    # pop(): O(1)
    # peek(): O(1)
    # size(): O(1)
    # show(): O(n)

  # Space Complexity: 
    #  O(n) where n is the maximum size of the stack. 
    # As the size keeps on changing space complexity also changes
   
     def __init__(self):
      self.stack = []
      self.top = -1
         
     def isEmpty(self):
       return self.top == -1
         
     def push(self, item):
      self.top += 1
      self.stack.append(item)
      
         
     def pop(self):
      if self.top == -1 : 
        print("Stack is empty")
        return ""
        
      self.top -= 1
      return self.stack.pop()
      
        
        
     def peek(self):
      return self.stack[self.top]
        
     def size(self):
      return self.top + 1
         
     def show(self):
      if self.top == -1: 
        return ("Stack is Empty")
      else : 
        stackstring = ""
        for i in range(self.top,-1,-1):
          stackstring += str(self.stack[i]) + "\n"
        return stackstring
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
