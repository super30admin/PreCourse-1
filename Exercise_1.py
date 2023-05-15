#Space complexity for myStack() function is O(n) where n is the number of elements in the stack
#Time complexity for isEmpty() function is O(1)
#Time complexity for push() function is O(1)
#Time complexity for pop() function is O(1)
#Time complexity for peek() function is O(1)
#Time complexity for size() function is O(1)
#Time complexity for show() function is O(1)
#Problem ran successfully on leetcode compiler
#I didn't face any problem while coding exercise_1


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
          #Creating a new list and naming that as stack.
          self.stack=[] 
         
     def isEmpty(self):
          #checking whether the stack is empty or not
          if(myStack.size()==0): 
              print("Stack is empty")
          else:
              print("Stack is not empty")
         
     def push(self, item):
         #pushing the input into the stack 
         self.stack.append(item)         
         
     def pop(self): 
          #removing the last element from the stack
          if(self.size()==0): 
              #checking whether the stack is empty or not
              print("Stack is empty")
          else:
              print("Last value in the stack has been popped")
              #if the stack is not empty we will be popping the the last element from the stack
              return self.stack.pop() 
        
     def peek(self):
         #checking whether the stack is empty or not
         if(self.size()==0): 
             print("Stack is empty")
         else:
             #Printing the peek value of the stack
             print(self.stack(self.size()-1)) 
        
     def size(self):
         #returns the size of the stack              
         return len(self.stack) 
         
     def show(self):
         #returns the entire remaining stack
         return self.stack 
                     

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
