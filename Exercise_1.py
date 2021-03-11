class myStack:
     def __init__(self):
         self.stack=[]
         
     def isEmpty(self):
         if len(self.stack)==0:
             return True
         
     def push(self, item):
         self.stack.append(item)
         
     def pop(self):
         if(self.stack):
             
           return self.stack.pop()
         else:
             return "Stack is empty"
        
        
     def peek(self):
         if(self.stack):
             
           return self.stack[-1]
         else:
             return "Stack is empty"
        
     def size(self):
         return len(self.stack)
         
     def show(self):
         print("The elements in the stack are:",end="\n")
         for i in range(len(self.stack)):
             print(self.stack[i],end="\n")
         
             
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
