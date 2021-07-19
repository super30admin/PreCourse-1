class myStack:
     def __init__(self):
          # Initializing Stack with an empty List
          self.stack = []
     def isEmpty(self):
          # Returns an empty list
          return self.stack == []
     def push(self, item):
          #Inserts the object at first index -- Cannot use Append
          self.stack.insert(0, item)
     def pop(self):
          # Implementing delete functionality as .pop() is an predefined func could also use self.stack.pop(0)
          del self.stack[0]
     def peek(self):
          # Returns first element of Stack
        return self.stack[0]
     def size(self):
          # Returns length of stack
         return len(self.stack)
     def show(self):
          # Returns the stack itself.
          return self.stack
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())

