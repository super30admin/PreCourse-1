class myStack:
     def __init__(self):
          """
          Initialising stack as an empty array
          TC: O(1)
          """
          self.stack = list()
         
     def isEmpty(self):
          """
          Check if stack is empty.
          --------
          returns:
          bool: true if stack is empty else returns false
          TC: O(1)
          """
          if not self.stack:
               return True
          return False
         
     def push(self, item):
          """
          Insert an item into the stack
          --------
          arguments:
          item: value to insert
          --------
          returns:
          None
          TC: O(1)
          """
          self.stack.append(item)
         
     def pop(self):
          """
          Delete last inserted element - maintain LIFO property
          ---------
          arguments:
          None
          ---------
          returns:
          item: last element that was inserted
          TC: O(1)
          """        
          if self.isEmpty():
               return
          item = self.stack.pop(-1)
          return item

        
     def peek(self):
          """
          Get last inserted element without popping it
          ---------
          arguments:
          None
          ---------
          returns:
          item: last element that was inserted
          TC: O(1)
          """
          if self.isEmpty:
               return 
          item = self.stack[-1]
          return item
        
     def size(self):
          """
          Get size (length) of stack
          --------
          arguments:
          None
          --------
          returns:
          length: length (size) of stack
          TC: O(1)
          """
          length = len(self.stack)
          return length
         
     def show(self):
          """
          Display current state of stack
          --------
          arguments:
          None
          --------
          returns:
          stack_arr : left to right shows top to bottom
          TC: O(1)
          """ 
          stack_arr = self.stack[::-1]
          return stack_arr
         

s = myStack()
s.push('10')
s.push('2')
print(s.show())
print(s.pop())
print(s.show())
