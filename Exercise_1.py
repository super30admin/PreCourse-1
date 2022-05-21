class myStack:
    # Please read sample.java file before starting.
    # Kindly include Time and Space complexity at top of each file
    # Time complexity: O(1)
    # Space complexity: O(1)
    def __init__(self):
        self.stack = []             # initializing empty stack
        self.stack_size = 5         # Max stack size

    def isEmpty(self):
        if len(self.stack) == 0:
            return True
        return False

    def push(self, item):
        if self.size() < self.stack_size:       # Checking if the stack is full
            self.stack.append(item)
        else:
            print("Stack Overflow!")

    def pop(self):
        if not self.isEmpty():                  # Checking empty stack
            last_element = self.stack[-1]
            del (self.stack[-1])
            return last_element                 # Deleting last entered element and returning it
        return "Stack Empty!"

    def peek(self):
        return self.stack[-1]                   # returns last entered element

    def size(self):
        return len(self.stack)                  # Finding size of the stack

    def show(self):
        return self.stack                       # Returns Entire Stack


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
