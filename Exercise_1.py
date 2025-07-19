# Time Complexity :
#   push: O(1)
#   pop: O(1)
#   for peek: O(1)
#   isEmpty: O(1)
#   size: O(1)
#   show: O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Not submitted
# Any problem you faced while coding this : No

class myStack:
    # Stack implementation using Python list (dynamic array)
    def __init__(self):
        # creating an empty list to store stack elements
        self.stack = []

    def isEmpty(self):
        # THis will return true if stack is empty, else false
        return len(self.stack) == 0

    def push(self, item):
        # Add item to the top of the stack
        self.stack.append(item)

    def pop(self):
        # Remove and return the top item of the stack
        if self.isEmpty():
            return None  # or raise exception
        return self.stack.pop()

    def peek(self):
        # Return the top item without removing it
        if self.isEmpty():
            return None
        return self.stack[-1]

    def size(self):
        # Return the number of items in the stack
        return len(self.stack)

    def show(self):
        # Return a list of all stack elements (bottom to top)
        return self.stack.copy()

s = myStack()
s.push('1')
s.push('2')
print(s.pop()) 
print(s.show()) 
