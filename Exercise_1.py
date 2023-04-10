## Implement Stack using Array.

# Stack is a linear and abstract data type that follows the principle of Last in First out
# Operations: Push, Pop, Peek, isEmpty, Size
# Time complexity for all the operation : O(1)
# Space complexity : O(1)

# Did this code successfully run on Leetcode : Unable to point question on leetcode. Ran locally and code looks fine

class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file.
    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if len(self.stack) == 0:
            return None
        return self.stack.pop()

    def peek(self):
        if len(self.stack) == 0:
            print("Stack is empty")
            return None
        return self.stack[len(self.stack) - 1]

    def size(self):
        return len(self.stack)

    def show(self):
        for item in range(len(self.stack)):
            print(self.stack[item])


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())