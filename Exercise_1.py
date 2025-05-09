#Time complexity overall:  O(n)
  #Push: O(1)
  #Pop: O(1)
  #Peek: O(1)
  #isEmpty: O(1)
  #Size: O(1)
  #Show: O(n)

#Space Complexity: O(n) To store n number of elements in the stack

class myStack:

     def __init__(self):
        self.stack = []
          
     def isEmpty(self):
        return len(self.stack) == 0
          
     def push(self, item):
         self.stack.append(item)
         
     def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        else:
          return "stack Empty can't Pop out"
        
     def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
          return "Stack is Empty no Items to Return"

     def size(self):
         return len(self.stack)
 
     def show(self):
         return self.stack
        
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
