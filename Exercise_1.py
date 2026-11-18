class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
      #Empty list to store the stack items
        self.stack =[]

         
     def isEmpty(self):
      # True if the stack has no items
        return len(self.stack) == 0 
         
     def push(self, item):
      # Add item to the top (end of the list)

        self.stack.append(item)
         
     def pop(self):
    # Can't remove from an empty stack
        if self.isEmpty():
            print("stack underflow")
            return None
   # Remove and return the top item

        return self.stack.pop()

     def peek(self):
      # Return the top item without removing it
        if self.isEmpty():
           return None
        return self.stack[-1]
   
     def size(self):
      # Number of items in the stack

        return len(self.myStack)
         
     def show(self):
      # Return all items, bottom to top

        return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
