class myStack:
     # Assuming lists to be like array with maximum capacity/fixed size as entered by user and stored in variable maxSize
          def __init__(self):
               self.arrayStack=list() 
               self.maxSize=int (input('Please enter the limit'))
               self.top=0

     # Returns true if stack is empty, else false.  
          def isEmpty(self):
               if len(self.arrayStack)==0:
                    return True
               else:
                    return False
         
     #  Pushes the element into stack(Last In First Out). if no element found and top=11 returns Stack is Full    
          def push(self, item):
               if self.top>=self.maxSize:
                    return 'Stack is full. Operation cannot be performed'
               self.arrayStack.append(item)
               self.top=self.top+1
       
     # Retrives/Returns the element from stack(Last In First Out). if no element found and top=-1 returns Stack is Empty 
          def pop(self):
               if self.top<=0:
                    return 'Stack is Empty.Please push elements'
               else:
                    element= self.arrayStack.pop()
                    return element

     # Returns the top element of stack 
          def peek(self):
               return self.top

     # Returns the value of top of stack
          def size(self):
               return len(self.arrayStack)
         
     # Displays/Returns the elements of the stack
          def show(self):
               return self.arrayStack
         


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print('Top of Stack is',s.peek())
print('Size of Stack is',s.size())
print(s.show())


