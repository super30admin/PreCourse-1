class myStack:
    '''
    Time Complexity:
    push: O(1) - Amortized (because dynamic arrays might occasionally take more time for resizing, but it averages out)
    pop: O(1)
    peek: O(1)
    isEmpty: O(1)
    size: O(1)
    show: O(n)
    
    Space Complexity:
    The space complexity for all operations is O(n) where n is the number of elements in the stack.
    '''

    def __init__(self):
        self.stack = []

    def isEmpty(self):
        return len(self.stack) == 0

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.isEmpty():
            return self.stack.pop()
        else:
            return "Stack is empty"

    def peek(self):
        if not self.isEmpty():
            return self.stack[-1]
        else:
            return "Stack is empty"

    def size(self):
        return len(self.stack)

    def show(self):
        return self.stack

s = myStack()
s.push('1')
s.push('2')
print(s.pop())  # Expected output: '2'
print(s.show())  # Expected output: ['1']
