# Time complexity: o(1) 
# space complexity : o(1)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
  
     def __init__(self):
       # this is the constructor
       self.items = [] 
         
     def isEmpty(self):
       return self.items == 0

         
     def push(self, item):
       self.items.append(item)
         
     def pop(self):
       if len(self.items) == 0:
            print('Can not pop form an empty list')
       return self.items.pop()
        
       
        
        
     def peek(self):
       # peek shows the top most element of the stack. Like pop it doesnt delete the element.
       if len(self.items) == 0:
            print('Stack is Empty')
       print(self.items[len(self.items) - 1]) 
        
     def size(self):
       return len(self.items)
         
     def show(self):
       if len(self.items) == 0:
            print('Stack is Empty')
       print(self.items[len(self.items) - 1]) 
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
