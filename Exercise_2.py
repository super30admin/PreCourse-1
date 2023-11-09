class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class Stack:
    def __init__(self):
        self._head = None
        self._top = -1

    def push(self, data) -> str:
        # Time Complexity : O(1)
        # Space Complexity : O(1)
        if self._top == -1:
            self._head = Node(data)
            self._top += 1
            return data
        temp_node = Node(data)
        temp_node.next = self._head
        self._head = temp_node
        self._top += 1
        return data

    def pop(self) -> str | None:
        # Time Complexity : O(1)
        # Space Complexity : O(1)
        if self._top == -1:
            return None
        value = self._head.data
        self._head = self._head.next
        self._top -= 1
        return value


a_stack = Stack()

while True:
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
    print('push <value>')
    print('pop')
    print('quit')
    do = input('What would you like to do? ').split()
    # Give input as string if getting an EOF error. Give input like "push 10" or "pop"
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
