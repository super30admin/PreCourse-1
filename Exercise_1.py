#Space Complexity: O(n) where n is the number of elements
#Time Complexity: O(1)
#The code did run successfully for all the functions
 

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []                   #using Python List as a stack
         
     def isEmpty(self):
        if not self.stack:                #checking if the stack is not a None object
          print("The stack is empty.")
        else:
          print("The stack is not empty.")
         
     def push(self, item):
        self.stack.append(item)             #adding element at the top
         
     def pop(self):
        if len(self.stack) == 0:             #checking if stack exists, if not then cannot perform the pop operation
          print('Item cannot be popped')
        pop_item = self.stack.pop()                                           #removing the topmost element
        print('The item that has been popped from the list is: ', pop_item)
        
     def peek(self):
          print("The element at the top of the stack is:",self.stack[-1])     #checking topmost element
        
     def size(self):
        stack_len = len(self.stack)                                           #checking the length of the stack(list)
        print("The size of the stack is: ",stack_len)
        return stack_len
         
     def show(self):
        print("The stack contains elements: ",self.stack)
        
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())