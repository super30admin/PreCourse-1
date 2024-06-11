# Time Complexity: O(1)
# Space Complexity: O(n)

class myStack:
    def __init__(self):
        # Initialize an empty stack
        self.stack = []
    
    def isEmpty(self):
        # Check if the stack is empty
        return len(self.stack) == 0
    
    def push(self, item):
        # Add an item to the top of the stack
        self.stack.append(item)
    
    def pop(self):
        # Remove and return the item from the top of the stack
        if self.isEmpty():
            return None
        return self.stack.pop()
    
    def peek(self):
        # Return the item at the top of the stack without removing it
        if self.isEmpty():
            return None
        return self.stack[-1]
    
    def size(self):
        # Return the number of items in the stack
        return len(self.stack)
    
    def show(self):
        # Display the stack elements
        return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())  
print(s.show()) 
