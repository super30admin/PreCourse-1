# Did this code successfully run on Leetcode :
# Any problem you faced while coding this : Nothing

# Your code here along with comments explaining your approach
class myStack:
  #Please read sample.java file before starting.
  #Kindly include Time and Space complexity at top of each file
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        """
        Check if the stack is empty.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        return len(self.stack) == 0

    def push(self, item):
        """
        Add an item to the stack.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        self.stack.append(item)

    def pop(self):
        """
        Remove and return the top item of the stack.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        if self.isEmpty():
            return None
        return self.stack.pop()

    def peek(self):
        """
        Return the top item of the stack without removing it.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        if self.isEmpty():
            return None
        return self.stack[-1]

    def size(self):
        """
        Return the size of the stack.
        Time Complexity: O(1)
        Space Complexity: O(1)
        """
        return len(self.stack)

    def show(self):
        """
        Return a list of elements in the stack.
        Time Complexity: O(n), where n is the number of elements in the stack.
        Space Complexity: O(n), where n is the number of elements in the stack.
        """
        return self.stack

# Test the stack
s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
