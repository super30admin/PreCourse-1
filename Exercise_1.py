""" The stack is initialized as a empty array. 
The isEmpty function is used to check if the stack has any elements.
This will be useful in pop() and peek() functions.
The push() function has a complexity of O(1) since it is simply appending.
The pop() function has a complexity of O(1) as well since it simply pops the top most element.
The peek() function has a complexity of O(1) as well since it returns the top of the stack without removing it.
The space complexity remains to be O(n) where n is the total elements in the stack. """

class myStack:
     def __init__(self):
        self.stack = []
         
     def isEmpty(self):
        if(self.stack==[]):
            return True
        return False
         
     def push(self, item):
        self.stack.append(item)
         
     def pop(self):
        return None if self.isEmpty() else self.stack.pop()
        
     def peek(self):
        return None if self.isEmpty() else self.stack[-1]

     def size(self):
        return len(self.stack)
         
     def show(self):
        return self.stack
         
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())