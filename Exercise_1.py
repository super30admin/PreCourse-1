class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  # Time Complexity 
  #   isEmpty -> O(1)
  #   push    -> O(1)
  #   pop     -> O(1)
  #   peek    -> O(1)
  #   size    -> O(1) 
  #   show    -> O(n) where n is the total no of elements in  myStack
  #  Space Complexity 
  #  O(n) where n is the total no of elements in  myStack

     def __init__(self):
        # use a list to store the stack
        self.myStack=[]

     def isEmpty(self):
        #  will return empty stack 
        return len(myStack) == 0
     
     def push(self, item):
        #  add the element to myStack
        self.myStack.append(item)

     def pop(self):
        # del the last element from the myStack
        if len(self.myStack) == 0:
           return None
        else:
           return self.myStack.pop()
        
     def peek(self):
        # will return the last element with out removing it from stack
        if len(self.myStack) == 0:
           return None
        else:
           return self.myStack[-1]
        
     def size(self):
        #  return the size of the stack
        return len(self.myStack)
     
     def show(self):
        # return the stack
        return self.myStack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
