# Time Complexity:
#   push(item): O(1)
#   pop(): O(1)
#   peek(): O(1)
#   isEmpty(): O(1)
#   size(): O(1)
#   show(): O(n) - where n is the number of elements in the stack
# Space Complexity: O(n) - for storing n elements in the stack

class myStack:
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if self.isEmpty():
            return "Stack Underflow"
        return self.stack.pop()

    def peek(self):
        if self.isEmpty():
            return "Stack is empty"
        return self.stack[-1]

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack.copy()  # returns a shallow copy of the stack


# Example usage:
s = myStack()
s.push('1')
s.push('2')
print(s.pop())      # Output: '2'
print(s.show())     # Output: ['1']
