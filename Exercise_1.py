class myStack:
     def __init__(self):
         self.arr=[]
     def isEmpty(self):
        if(len(self.arr)==0):
            return True
        else:
            return False
     def push(self, item):
        self.arr.append(item)
     def pop(self):
        if(not(self.isEmpty())):
            removed=self.arr[-1]
            del self.arr[-1]
            return("Removed",removed)
        else:
            return "Stack is Empty"
  '''Better way of implmenting pop operation, don't use del      
     def pop(stack): 
    if (isEmpty(stack)): 
        return str(-maxsize -1) # return minus infinite 
      
    return stack.pop() 
  
# Function to return the top from stack without removing it 
def peek(stack): 
    if (isEmpty(stack)): 
        return str(-maxsize -1) # return minus infinite 
    return stack[len(stack) - 1] 
'''
     def peek(self):
        if(not(self.isEmpty())):
            return(self.arr[-1])
        else:
            return("Stack is Empty")
        
     def size(self):
         return len(self.arr)
         
     def show(self):
        return self.arr;
         

s = myStack()
s.push('1')
s.push('2')
print(s.show())
print(s.pop())
print(s.pop())
print(s.pop())
