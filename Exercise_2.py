class Node:
    def __init__(self, data):
       self.data = data
       self.next = None


class Stack:
    '''Stack implementation using a Linked List.'''

    def __init__(self):
        self._top = None
        self._size = 0

    def isEmpty(self):                                  # O(1)
        return self._size == 0

    def push(self, item):                               # O(1)
        node = Node(item)
        node.next = self._top
        self._top = node
        self._size += 1

    def pop(self):                                      # O(1)
        if self.isEmpty():
            raise Exception('Stack is Empty!')

        data = self._top.data
        self._top = self._top.next
        self._size -= 1
        return data

    def peek(self):                                     # O(1)
        if self.isEmpty():
            raise Exception('Stack is Empty!')

        return self._top.data

    def show(self):
        store = []
        walk = self._top
        while walk is not None:
            store.append(walk.data)
            walk = walk.next
        return '\n'.join([str(x) for x in store])



a_stack = Stack()
while True:
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()

    operation = do[0].strip().lower()
    if operation == 'push':
        a_stack.push(int(do[1]))
    elif operation == 'pop':
        popped = a_stack.pop()
        if popped is None:
            print('Stack is empty.')
        else:
            print('Popped value: ', int(popped))
    elif operation == 'quit':
        break
