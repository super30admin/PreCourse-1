class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
         #initializing the stack as a list
         self.array = []
         
     def isEmpty(self):
         #Checking if the Stack is empty
         print(len(self.array)==0)
     
     def push(self, item):
         #Pushing item into the stack at the last position
         self.array.append(item)
     
     def pop(self):
         #popping item which was last inserted (LIFO)
         self.array = self.array[:-1]
        
     def peek(self):
         #Just viewing the last/top element of stack
         return self.array[-1]
     
     def size(self):
         #finding size of the stack
         print(len(self.array),"   ",self.array)
        
     def show(self):
         #Displaying the stack elements
        print(self.array)         

s = myStack()
s.push('1')
s.push('2')
s.size()
s.isEmpty()
print(s.pop())
