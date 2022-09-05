from inspect import stack

# Time Complexity : O(1) for push, pop , peek
# Space omplexity : O(n) based on size of stack 
# Problems faced : No problems faced 


class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack=[]
         
     def isEmpty(self):
       return self.stack== []
         
     def push(self, item):
         self.stack.append(item)
    
     def pop(self):
        if(not self.isEmpty()):
          lastElement = self.stack[-1]
          del self.stack[-1]
          return lastElement
        
     def peek(self):
       if(not self.isEmpty()):
          lastElement = self.stack[-1]
          return lastElement
        
     def size(self):
       return len(self.stack)
         
     def show(self):
         for i in range(len(self.stack)):
           print(self.stack[i])

s = myStack()
s.push('1')
s.push('2')
print("Popped element is :",s.pop())
print(s.show())
