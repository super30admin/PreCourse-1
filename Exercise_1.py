# Time Complexity:
#   push()   : O(1) - Inserting at the end of the list takes constant time.
#   pop()    : O(1) - Removing the last element takes constant time.
#   peek()   : O(1) - Accessing the last element is a constant-time operation.
#   isEmpty(): O(1) - Checking if the stack is empty is constant time.
#   size()   : O(1) - Returning the length of the list is constant time.
#   show()   : O(n) - Displaying all elements takes linear time, where n is the number of elements.

# Space Complexity: O(n) - We use a list to store the elements, and it grows with the number of elements.

# Did this code successfully run on Leetcode? 
# Not applicable (as it's a custom implementation), but it runs successfully on local environments.

# Any problem you faced while coding this:
# No issues encountered.

class myStack:
    def __init__(self):
        # Initialize an empty list to represent the stack
        self.stack = []

    def isEmpty(self):
        # Check if the stack is empty
        return len(self.stack) == 0

    def push(self, item):
        # Add an item to the top of the stack
        self.stack.append(item)

    def pop(self):
        # Remove and return the top item from the stack
        if not self.isEmpty():
            return self.stack.pop()
        else:
            return "Stack is empty"

    def peek(self):
        # Return the top item without removing it
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return "Stack is empty"

    def size(self):
        # Return the size of the stack
        return len(self.stack)

    def show(self):
        # Display all items in the stack
        return self.stack

# Your code here along with comments explaining your approach:
# - We use a Python list to simulate a stack.
# - `push()` adds an item to the stack.
# - `pop()` removes the top item.
# - `peek()` returns the top item without removing it.
# - `isEmpty()` checks if the stack is empty.
# - `size()` returns the number of elements in the stack.
# - `show()` prints all elements in the stack.

# Testing the stack implementation
s = myStack()
s.push('1')
s.push('2')
print(s.pop())     # Output: '2'
print(s.show())    # Output: ['1']