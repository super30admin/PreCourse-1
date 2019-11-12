class myStack:
     def __init__(self):
         self.stack = []

     def isEmpty(self):
          """
          check whether the stack is equal to empty list
          """
          return self.stack == []
         
     def push(self, item):
          """
          Append the item to the list
          """
          self.stack.append(item)
         
     def pop(self):
          """
          Check whether the length of stack is 0, if yes return None else pop the last element and return it
          """
          return self.stack.pop() if len(self.stack) != 0 else None
        
     def peek(self):
          """
          Check whether the length of stack is 0, if yes return None else return the last element
          """
          return self.stack[-1] if len(self.stack) != 0 else None
        
     def size(self):
          """
          Get the size of the stack
          """
          return len(self.stack)
         
     def show(self):
          """
          show the stack
          """
          return self.stack
         

s = myStack()
print(s.peek())
s.push('1')
s.push('2')
print(s.peek())
print(s.pop())
print(s.show())
