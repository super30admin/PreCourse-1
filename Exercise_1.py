#Space Complexity: O(n) ... n is no. of items
#Time Complexity: O(n)

class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
        self.stack = []
         
     def isEmpty(self):
        if not self.stack:
          print("The stack is empty.")
        else:
          print("The stack is not empty.")
         
     def push(self, item):
       self.stack.append(item) 
         
     def pop(self):
        if len(self.stack) == 0:
          print('Item cannot be popped')
        pop_item = self.stack.pop()
        print('The item that has been popped from the list is: ', pop_item)
        
     def peek(self):
          print("The element at the top of the stack is:",self.stack[-1])
        
     def size(self):
        stack_len = len(self.stack)
        print("The size of the stack is: ",stack_len)
        return stack_len
         
     def show(self):
        print("The stack contains elements: ",self.stack)
        
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())