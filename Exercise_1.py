# Time Complexity:
# - append: O(n)
# - find: O(n)
# - remove: O(n)
# Space Complexity: O(n) (for storing elements in the list)

class myStack:
    
    # initialize the stack
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        # return True if the stack is empty
        return len(self.stack) == 0

    def push(self, item):
        
        #push the item to the stack
        self.stack.append(item)

    def pop(self):
        
        # this removes the last element from the stack if not returns the message
        if not self.isEmpty():
            return self.stack.pop()
        else:
            return "Stack is empty"

    def peek(self):
        
        # this returns the last element from the stack if not returns the message
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return "Stack is empty"

    def size(self):
        
        # returns the length of the stack
        return len(self.stack)

    def show(self):
        
        # returns the stack
        return self.stack

# Example usage
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
