# RIken Kapadia
# Time Complexity: 

# push: O(1)
# pop: O(1)
# peek: O(1)
# isEmpty: O(1)
# size: O(1)
# show: O(n), where n is the number of elements in the stack

# Space Complexity:
# O(n), where n is the number of elements stored in the stack 


class myStack:
  
     def __init__(self):
        # initialize an empty list to store stack elements
        self.stack=[] 

     def isEmpty(self):
        # Return True if the stack is empty, else False
        return not self.stack

     def push(self, item):
        # Add item to the top of the stack
        self.stack.append(item)
         
     def pop(self):
         # Remove and return the top item from the stack, If stack is empty, return None
         if not self.isEmpty():
             return self.stack.pop()
         return None
        
     def peek(self):
         # Return the top item of the stack without removing it, If stack is empty, return None
         if not self.isEmpty():
            return self.stack[-1]
         return None
        
     def size(self):
         # Return the number of elements in the stack. (in short lenght of the stack)
         return len(self.stack)
         
     def show(self):
         # Return a copy of the current stack
         return self.stack.copy()
         

s = myStack()
s.push('1') # Stack: ['1']
s.push('2') # Stack: ['1', '2']
print(s.pop())  # Output: '2', Stack after pop: ['1']
print(s.show())  # Output: ['1']
