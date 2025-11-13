# Time Complexity:
#   push()    -> O(1)
#   pop()     -> O(1)
#   peek()    -> O(1)
#   isEmpty() -> O(1)
#   size()    -> O(1)
#   show()    -> O(n)
# Space Complexity: O(n) where n is the number of elements in the stack

# Any problem you faced while coding this : no

class myStack:
    def __init__(self):
        # Initialize an empty stack using a list
        self.stack = []

    def isEmpty(self):
        # Returns True if stack is empty, False otherwise
        return len(self.stack) == 0

    def push(self, item):
        # Adds an item to the top of the stack
        self.stack.append(item)

    def pop(self):
        # Removes and returns the top item of the stack
        if self.isEmpty():
            return "Stack is empty"
        return self.stack.pop()

    def peek(self):
        # Returns the top item of the stack without removing it
        if self.isEmpty():
            return "Stack is empty"
        return self.stack[-1]

    def size(self):
        # Returns the number of elements in the stack
        return len(self.stack)

    def show(self):
        # Returns a list of all stack elements
        return self.stack.copy()
         

s = myStack()
s.push('1')
s.push('2')
print(s.pop())   # 2
print(s.show())   # ['1']
