#Time Complexity: isEmpty, push, pop, peek, size - O(1) and show - O(n)
#Space Complexity: O(n)
#n refers to number of elements in stack

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.items = []
         
     def isEmpty(self):
       #Check if stack is empty
       return len(self.items) == 0
         
     def push(self, item):
       #Add an item to the top of the stack
       self.items.append(item)
         
     def pop(self):
       #Remove and return the top item 
       if self.isEmpty():
         return None
       return self.items.pop()
        
        
     def peek(self):
       #Return the top item in stack
       if self.isEmpty():
         return None
        return self.items[-1]
        
     def size(self):
       #Return the total items in the stack
       return len(self.items)
         
     def show(self):
       #Display the stack elements
       if self.isEmpty():
         print("Stack is empty")
       else:
         print("Final Stack: ", self.items[::-1])
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
