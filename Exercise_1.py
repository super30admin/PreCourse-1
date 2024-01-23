class MyStack:
    # Time Complexity: O(1) for all operations
    # Space Complexity: O(n), where n is the number of elements in the stack

    def __init__(self):
        self.stack = []

    def is_empty(self):
        return not bool(self.stack)

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        else:
            print("Stack is empty. Cannot pop.")

    def peek(self):
        if not self.is_empty():
            print(self.stack[-1])
        else:
            print("Stack is empty. Cannot peek.")

    def size(self):
        print(len(self.stack))

    def show(self):
        for c in self.stack:
            print(c)

# Example usage:
s = MyStack()
s.push('1')
s.push('2')
s.pop()
s.show()
