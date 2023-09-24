import array

# Time and Space Complexity:
# - __init__: O(1) time, O(1) space
# - isEmpty: O(1) time, O(1) space
# - push: O(1) time, O(1) space
# - pop: O(1) time, O(1) space
# - peek: O(1) time, O(1) space
# - size: O(1) time, O(1) space
# - show: O(N) time (N is the number of elements in the stack), O(N) space

class myStack:
    def __init__(self):
        self.stack = array.array('i')  # Using an array of integers to implement the stack

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        else:
            return None

    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return None

    def size(self):
        return len(self.stack)

    def show(self):
        return list(self.stack)

# Create a myStack object
s = myStack()

# Push elements onto the stack
s.push(1)
s.push(2)

# Pop an element from the stack and print it
print(s.pop())

# Display the elements in the stack
print(s.show())
