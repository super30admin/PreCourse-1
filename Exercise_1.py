# Time Complexity : O(1)
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
     def __init__(self):
       self.stack = []

     def isEmpty(self):
       return self.stack == []
        
     def push(self, item):
       self.stack.append(item)
         
     def pop(self):
        if self.isEmpty():
            return "stack empty"
        else:
            ele = self.stack[-1]
            del(self.stack[-1])
            return ele
        
     def peek(self):
        return self.stack[-1]
     def size(self):
        return len(self.stack)
     def show(self):
        if self.isEmpty():
             print("Stack is Empty!")
        else:
             return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

