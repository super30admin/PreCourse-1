class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# O(N) time | O(1) Space
class Stack:
    def __init__(self):
        self.stack = Node(None)

    def push(self, data):
        node = self.stack
        while node.next is not None:
            node = node.next
        node.next = Node(data)

    def pop(self):
        node = self.stack.next
        if node is None:
            return None
        prev = self.stack
        while node.next is not None:
            node = node.next
            prev = prev.next
        res = node.data
        prev.next = None
        return res


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
