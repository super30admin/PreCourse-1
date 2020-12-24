class myStack:
    '''Stack implementation using an Array.'''

    def __init__(self):
        self._storage = []

    def isEmpty(self):                                  # O(1)
        return self.size() == 0

    def push(self, item):                               # O(1)
        self._storage.append(item)

    def pop(self):                                      # O(1)
        if self.isEmpty():
            raise Exception('Stack is Empty!')
        return self._storage.pop()

    def peek(self):                                     # O(1)
        if self.isEmpty():
            raise Exception('Stack is Empty!')
        return self._storage[-1]

    def size(self):                                     # O(1)
        return len(self._storage)

    def show(self):
        return '\n'.join(reversed(self._storage))


s = myStack()
s.push('1')
s.push('2')
print(s.pop())
print(s.show())
