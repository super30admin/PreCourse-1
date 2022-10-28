from inspect import stack


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack=[]#Initialized empty list
      
     def isEmpty(self):
       if len(self.stack)==0:#if there are no elements then printing stack is empty
         print('Stack is Empty')
       else:
         return self.stack #Otherwise returning stack
         
     def push(self, item):
       self.stack.append(item) #Adding element using append function
       #print(self.stack)
         
     def pop(self):
       if len(self.stack)==0:
         print('Stack is empty')  #If Stack is empty
       return self.stack.pop()
        
        
     def peek(self):
       if len(self.stack)==0:
         print('Stack is empty')
       else:
         print(self.stack[len(self.stack)-1]) #Printed last element in the list
        
     def size(self):
       print(len(self.stack)) #To check Currnet size of stack
         
     def show(self):
       return self.stack #Printing current elements in the stack.
         

s = myStack()

s.push('1')
s.push('2')
s.size()
s.peek()
print(s.pop())
print(s.show())
s.isEmpty()

#Time complexity for this code is O(1)
#Space complexity is O(1)


