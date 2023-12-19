class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.items = [] #initializing an array to build a stack
     
     # a boolean function to check if the stack is empty    
     def isEmpty(self):
        if(len(self.items) == 0):
              return True
        else:
              return False
     
     #function to add to the stack    
     def push(self, item):
        self.items.append(item)
     
     #function to remove the top element of the stack and return it    
     def pop(self):
        if not self.isEmpty():
          return self.items.pop()
        else:
          return IndexError("Cannot pop from an empty stack")
     
     #function to look at the top element of the stack
     def peek(self):
        if not self.isEmpty():
          return self.items[-1]
        else:
          return IndexError("Cannot peek from an empty stack")
       
     #function to return the size of the stack  
     def size(self):
        return len(self.items)
     
     #using a loop to print to the items in the stack    
     def show(self):
        for i in self.items:
              print(i)
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
