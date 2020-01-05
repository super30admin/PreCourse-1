"""
    Having difficulties with time and space complexities.
    Not sure if they are correct.
"""

class Stack:
    """
        Time Complexity: Constant O(1)
        Space Complexity: Constant O(1)
    """
    def __init__(self):
        self.stack = []

    '''
        Time Complexity: Constant O(1)
        Space Complexity: Constant O(1)
    '''
    def isEmpty(self):
        return len(self.stack) == 0

    '''
        Time Complexity: Constant O(n)
        Space Complexity: Constant O(n)
    '''
    def push(self, item):
        self.stack.append(item)

    '''
        Time Complexity: Constant O(n)
        Space Complexity: Constant O(1)
    '''
    def pop(self):
        data = None
        if self.stack:
            data = self.stack[-1]
            self.stack.pop(-1)
        return data

    '''
        Time Complexity: Constant O(n)
        Space Complexity: Constant O(1)
    '''
    def peek(self):
        if self.stack:
            return self.stack[-1]

    '''
        Time Complexity: Constant O(1)
        Space Complexity: Constant O(1)
    '''
    def size(self):
        return len(self.stack)

    '''
        Time Complexity: Constant O(n)
        Space Complexity: Constant O(1)
    '''
    def show(self):
        return self.stack


s = Stack()
print(f'Pop operation from empty stack : {s.pop()}')
print(f'Show operation from empty stack : {s.show()}')
print(f'Empty operation from empty stack : {s.isEmpty()}')
print(f'Size operation from empty stack : {s.size()}')
s.push('1')
s.push('2')
s.push('3')
print(f'Empty operation : {s.isEmpty()}')
print(f'Size operation : {s.size()}')
print(f'Peek operation : {s.peek()}')
print(f'Pop operation : {s.pop()}')
print(f'Show operation : {s.show()}')
print(f'Pop operation : {s.pop()}')
print(f'Show operation : {s.show()}')
print(f'Pop operation : {s.pop()}')
print(f'Empty operation from empty stack : {s.isEmpty()}')
print(f'Size operation from empty stack : {s.size()}')
