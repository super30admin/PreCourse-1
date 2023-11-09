#Time Complexity for inserting an element into the stack: O(1)
#Time complexity to pop an element from the beginning of stack:O(1)
#Time complexity to pop an element from the end : O(n)
#Space complexity of stack: O(1)
class myStack:
#Please read sample.java file before starting.
#Kindly include Time and Space complexity at top of each file
     def __init__(self):
         self.stack=[] #initializing stack
         self.arr_size=100 #implementing stack using array which is of fixed size

     def isEmpty(self):
         return len(self.stack)==0 #checking if stack is empty by finding the length of stack

     def push(self, item):
         if len(self.stack)<self.arr_size: #verifying if the stack is not overflowing
            return self.stack.append(item) 
         else:
            return "Stack Overflow"
         
     def pop(self):
         if self.isEmpty(): # checking if stack is empty 
             return "No elements to pop"
         return self.stack.pop() #popping element from the stack which is LIFO operation
         
     def peek(self):
         if len(self.stack)==0: #checking if stack is not empty 
             return "No peek element in empty stack"
         return self.stack[-1] # this returns the last inserted element in the stack
        
     def size(self):
         return len(self.stack) # returns size of stack
         
     def show(self):
         return self.stack #prints the entire stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
